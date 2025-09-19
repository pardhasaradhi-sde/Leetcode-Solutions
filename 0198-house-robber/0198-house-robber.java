class Solution {
    public int solve(int ind,int[] nums,int[] dp)
    {
        if(ind>=nums.length)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int rob=nums[ind]+solve(ind+2,nums,dp);
        int leave=solve(ind+1,nums,dp);
        return dp[ind]=Math.max(rob,leave);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(0,nums,dp);
    }
}