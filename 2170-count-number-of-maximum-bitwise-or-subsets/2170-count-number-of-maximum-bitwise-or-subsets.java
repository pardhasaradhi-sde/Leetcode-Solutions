class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int or=0;
        for(int i=0;i<nums.length;i++)
        {
            or=or|nums[i];
        }
        int subsets=1<<nums.length;
        int count=0;
        for(int mask=0;mask<subsets;mask++)
        {
            int curror=0;
            for(int i=0;i<nums.length;i++)
            {
                if((mask&(1<<i))!=0)
                {
                    curror=curror|nums[i];
                }
            }
            if(curror==or)
            {
                count++;
            }
        }
        return count;
    }
}