class Solution {
    public int solve(int row,int col,int rows,int cols,int[][] grid,int dp[][])
    {
         if(row==rows-1 && col==cols-1)
        {
            return grid[rows-1][cols-1];
        }
        if(row>=rows || col>=cols)
        {
            return (int)Math.pow(10,9);
        }
        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        int down=grid[row][col]+solve(row+1,col,rows,cols,grid,dp);
        int right=grid[row][col]+solve(row,col+1,rows,cols,grid,dp);
        return dp[row][col]=Math.min(down,right);
    }
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,grid.length,grid[0].length,grid,dp);
    }
}