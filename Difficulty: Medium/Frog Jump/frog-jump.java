// User function Template for Java
class Solution {
    int solve(int ind,int[] height,int[] dp)
    {
        if(ind==0)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int left=solve(ind-1,height,dp)+Math.abs(height[ind]-height[ind-1]);
        int right=Integer.MAX_VALUE;
        if(ind>1)
        {
            right=solve(ind-2,height,dp)+Math.abs(height[ind]-height[ind-2]);
        }
        return dp[ind]=Math.min(right,left);
    }
    int minCost(int[] height) {
        int dp[]=new int[height.length];
        Arrays.fill(dp,-1);
        
        return solve(height.length-1,height,dp);
    }
}