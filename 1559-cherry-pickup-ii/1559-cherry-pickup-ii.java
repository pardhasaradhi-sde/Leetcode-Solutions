class Solution {
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][][] dp=new int[m][n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
       return Math.max(0,cherryUtil(0,0,n-1,m,n,grid,dp));
    }
    
    private int cherryUtil(int row, int col1, int col2, int rows, int cols, int[][] grid,int[][][] dp) {
        if(col1<0 || col1>=cols || col2<0 || col2>=cols)
        {
            return -(int)1e9;
        }
        if(row==rows-1)
        {
            if(col1==col2)
            {
                return grid[row][col1];
            }
            return grid[row][col1]+grid[row][col2];
        }
        if(dp[row][col1][col2]!=-1)
        {
            return dp[row][col1][col2];
        }
        int val=(col1==col2)?grid[row][col1]: grid[row][col1]+grid[row][col2];
        int max=-(int)1e9;
        for(int d1=-1;d1<2;d1++)
        {
            for(int d2=-1;d2<2;d2++)
            {
                int next=val+cherryUtil(row+1,col1+d1,col2+d2,rows,cols,grid,dp);
                max=Math.max(next,max);
            }
        }
        return dp[row][col1][col2]=max;
    }
}
