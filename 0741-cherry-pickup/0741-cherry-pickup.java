class Solution {
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][][]dp=new int[n][n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                        dp[i][j][k]=-1;
                }
            }
        }
        return Math.max(0,dfs(0,0,0,m,n,grid,dp));
    }
    private int dfs(int r1,int c1,int c2,int rows,int cols,int[][] grid,int[][][] dp)
    {
        int r2=r1+c1-c2;
        if(r1>=rows || r2>=rows || c1>=cols || c2>=cols || grid[r1][c1]==-1 || grid[r2][c2]==-1)
        {
            return -(int)1e9;
        }
        if(r1==rows-1 && c1==cols-1 )
        {
            return grid[r1][c1];
        }
        if(r2==rows-1 && c2==cols-1 )
        {
            return grid[r2][c2];
        }
        if(dp[r1][c1][c2]!=-1)
        {
            return dp[r1][c1][c2];
        }
        int cherries=(r1==r2 && c1==c2)?grid[r1][c1]:grid[r1][c1]+grid[r2][c2];
        int max=-(int)1e9;
        max=Math.max(max,cherries+dfs(r1+1,c1,c2,rows,cols,grid,dp));
        max=Math.max(max,cherries+dfs(r1+1,c1,c2+1,rows,cols,grid,dp));
        max=Math.max(max,cherries+dfs(r1,c1+1,c2,rows,cols,grid,dp));
        max=Math.max(max,cherries+dfs(r1,c1+1,c2+1,rows,cols,grid,dp));
        return dp[r1][c1][c2]=max;
    }
}
