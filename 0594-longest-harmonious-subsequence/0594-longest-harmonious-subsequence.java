class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=0;
        int maxcount=0;
        while(right<nums.length)
        {
            while(nums[right]-nums[left]>1)
            {
               left++;
            }
            if(nums[right]-nums[left]==1)
            {
                maxcount=Math.max(maxcount,right-left+1);
            }
            right++;
        }
        return maxcount;
    }
}