class Solution {
     public int backtrack(int[][] maze,int row,int col,int[][] dp)
    {
        int m=maze.length;
        int n=maze[0].length;
        if(row==m-1 && col==n-1)
        {
            return 1;
        }
        if(row<0 || row>=m || col<0 || col>=n || maze[row][col]==1)
        {
            return 0;
        }
        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        int down=backtrack(maze,row+1,col,dp);
        int right=backtrack(maze,row,col+1,dp);
        return dp[row][col]=down+right;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return backtrack(obstacleGrid,0,0,dp);
    }
}