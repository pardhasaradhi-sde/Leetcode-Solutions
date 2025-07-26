class Solution {
    public int jump(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int count=0;
        int jumps=0;
        int i=0;
        int farthest=0;
        while(i<nums.length-1)
        {
            farthest=Math.max(farthest,i+nums[i]);
            if(i==jumps)
            {
                count++;
                jumps=farthest;
            }
                i++;
        }
        return count;
    }
}