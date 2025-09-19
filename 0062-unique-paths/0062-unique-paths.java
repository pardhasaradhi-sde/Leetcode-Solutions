class Solution {
    public int backtrack(int row,int col,int m,int n,int[][] dp)
    {
        if(row==m-1 && col==n-1)
        {
            return 1;
        }
        if(row>=m || col>=n )
        {
            return 0;
        }
        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        int down=backtrack(row+1,col,m,n,dp);
        int right=backtrack(row,col+1,m,n,dp);
        return dp[row][col]=down+right;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return backtrack(0,0,m,n,dp);
    }
}