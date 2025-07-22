class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1=new ArrayList<>();
        int subsets=1<<nums.length;
        for(int i=0;i<subsets;i++)
        {
            List<Integer> l2=new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if((i&(1<<j))!=0)
                {
                    l2.add(nums[j]);
                }
            }
            l1.add(l2);
            
        }
        return l1;
    }
}