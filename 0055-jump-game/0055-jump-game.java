class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;
        int i=0;
        while(i<nums.length && i<=maxreach)
        {
            maxreach=Math.max(maxreach,i+nums[i]);
            i++;
        }
        return maxreach>=nums.length-1;
    }
}