class Solution {
    public int solverob(int start,int end,int[] nums,int[] dp)
    {
        if(start>end)
        {
            return 0;
        }
        if(dp[start]!=-1)
        {
            return dp[start];
        }
        int take=solverob(start+2,end,nums,dp)+nums[start];
        int rob=solverob(start+1,end,nums,dp);
        return dp[start]=Math.max(take,rob);
    }
    public int solve(int[] nums,int start,int end)
    {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int skip1=solverob(start+1,end,nums,dp);
        int dp2[]=new int[nums.length+1];
        Arrays.fill(dp2,-1);
        int noskip=solverob(start,end-1,nums,dp2);
        return dp[start]=Math.max(skip1,noskip);
    }
    public int rob(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        return solve(nums,0,nums.length-1);
    }
}