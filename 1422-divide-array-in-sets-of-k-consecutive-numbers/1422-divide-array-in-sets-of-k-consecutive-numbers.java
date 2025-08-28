class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)
        {
            return false;
        }
        Map<Integer,Integer> m1=new HashMap<>();
        PriorityQueue<Integer> p1=new PriorityQueue<>();
        for(int num:nums)
        {
            p1.offer(num);
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        while(!p1.isEmpty())
        {
            int start=p1.peek();
            for(int i=0;i<k;i++)
            {
                int cur=start+i;
                if(!m1.containsKey(cur) || m1.get(cur)==0)
                {
                    return false;
                }
                m1.put(cur,m1.get(cur)-1);
            }
            while(!p1.isEmpty() && m1.get(p1.peek())==0)
            {
                p1.poll();
            }
        }
        return true;
    }
}