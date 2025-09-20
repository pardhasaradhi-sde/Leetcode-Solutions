// User function Template for Java

class Solution {
    public static int solve(int row,int col,int rows,int cols,int[][] dp)
    {
        if(row==rows-1 && col==cols-1)
        {
            return 1;
        }
        if(row>=rows || col>=cols)
        {
            return 0;
        }
        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        int down=solve(row+1,col,rows,cols,dp);
        int right=solve(row,col+1,rows,cols,dp);
        return dp[row][col]=down+right;
    }
    // Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) {
        int dp[][]=new int[a][b];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,a,b,dp);
    }
}