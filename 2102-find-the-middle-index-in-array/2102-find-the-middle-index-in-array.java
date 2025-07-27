class Solution {
    public int findMiddleIndex(int[] nums) {
        int total=0;
        for(int num:nums)
        {
            total+=num;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(2*leftsum+nums[i]==total)
            {
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}