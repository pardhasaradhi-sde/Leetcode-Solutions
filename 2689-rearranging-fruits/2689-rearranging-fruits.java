class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer,Integer> l1=new HashMap<>();
        Map<Integer,Integer> map1=new HashMap<>();
        for(int basket:basket1)
        {
            map1.put(basket,map1.getOrDefault(basket,0)+1);
            l1.put(basket,l1.getOrDefault(basket,0)+1);
        }for(int basket:basket2)
        {
            l1.put(basket,l1.getOrDefault(basket,0)+1);
        }
        for(int count:l1.values())
        {
            if(count%2!=0)
            {
                return -1;
            }
        }
        
        int globalmin=Integer.MAX_VALUE;
        for(int i=0;i<basket1.length;i++)
        {
            globalmin=Math.min(globalmin,basket1[i]);
        }
        for(int num:basket2)
        {
            globalmin=Math.min(globalmin,num);
        }
        List<Integer> toswap=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:l1.entrySet())
        {
            int key=entry.getKey();
            int value=entry.getValue();
            int total=value;
            int ideal=total/2;
            int in1=map1.getOrDefault(key,0);
            int in2=total-in1;
            if(in1>ideal)
            {
                for(int i=0;i<in1-ideal;i++)
                {
                    toswap.add(key);
                }
            }
            if(in2>ideal)
            {
                for(int i=0;i<in2-ideal;i++)
                {
                    toswap.add(key);
                }
            }

        }
        Collections.sort(toswap);
        long cost=0;
        int m=toswap.size();
        for(int i=0;i<m/2;i++)
        {
            cost+=Math.min(toswap.get(i),2*globalmin);
        }
        return cost;
    }
}