class Solution {
    public int solve(int row,int col,int rows,int cols,int[][] grid,int[][] dp)
    {
        if(row>=rows || col>=cols || grid[row][col]==1)
        {
            return 0;
        }
        if(row==rows-1 && col==cols-1)
        {
            return 1;
        }
        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        int down=solve(row+1,col,rows,cols,grid,dp);
        int right=solve(row,col+1,rows,cols,grid,dp);
        return dp[row][col]=down+right;
    }
    public int uniquePaths(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,grid.length,grid[0].length,grid,dp);
    }
};