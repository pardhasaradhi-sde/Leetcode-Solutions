class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(values,0,n-1,dp);
    }
    public int solve(int[] values,int i,int j,int[][] dp)
    {
        if(j-i+1<3)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++)
        {
            int score=values[i]*values[j]*values[k]+solve(values,i,k,dp)+solve(values,k,j,dp);
            min=Math.min(min,score);
        }
        return dp[i][j]=min;
    }
}