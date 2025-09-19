class Solution {
    public int dpfib(int n,int[] dp)
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=dpfib(n-1,dp)+dpfib(n-2,dp);
    }
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return dpfib(n,dp);
    }
}