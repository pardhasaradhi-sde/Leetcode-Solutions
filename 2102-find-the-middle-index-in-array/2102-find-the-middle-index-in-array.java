class Solution {
    public int findMiddleIndex(int[] nums) {
        int left=0;
        int right=0;
        int result=-1;
        for(int num:nums)
        {
            right+=num;
        }
        for(int i=0;i<nums.length;i++)
        {
            right=right-nums[i];
            if(right==left)
            {
                result=i;
                break;
            }
            else{
            left+=nums[i];
            }
        }
        return result;
    }
}