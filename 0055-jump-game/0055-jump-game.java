class Solution {
    public boolean canJump(int[] nums) {
        int jumps=nums[0];
        int i=1;
        while(i<nums.length && jumps>0)
        {
            jumps--;
            jumps=Math.max(jumps,nums[i]);
            i++;
        }
        return i==nums.length;
    }
}