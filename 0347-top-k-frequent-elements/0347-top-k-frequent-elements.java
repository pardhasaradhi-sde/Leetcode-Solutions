class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int num:nums)
        {
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> p1=new PriorityQueue<>(
            (a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry:m1.entrySet())
        {
            p1.offer(entry);
        }
        int num[]=new int[k];
        int i=0;
        while(p1.size()>k)
        {
            p1.poll();
        }
        while(!p1.isEmpty())
        {
            num[i]=p1.poll().getKey();
            i++;
        }
        return num;
    }
}