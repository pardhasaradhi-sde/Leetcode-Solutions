class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> l1=new HashMap<>();
        for(int num:nums)
        {
            l1.put(num,l1.getOrDefault(num,0)+1);
        }
        int maxcount=0;
        for(int i:l1.keySet())
        {
            if(l1.containsKey(i+1))
            {   
                maxcount=Math.max(maxcount,l1.get(i)+l1.get(i+1));
            }
        }
        return maxcount;
    }
}