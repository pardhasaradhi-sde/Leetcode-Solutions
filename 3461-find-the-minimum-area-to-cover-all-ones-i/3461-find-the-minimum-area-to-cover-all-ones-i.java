class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int minrow=n,maxrow=-1,mincol=m,maxcol=-1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    minrow=Math.min(minrow,i);
                    maxrow=Math.max(maxrow,i);
                    mincol=Math.min(mincol,j);
                    maxcol=Math.max(maxcol,j);
                }
            }
        }
        int row=maxrow-minrow+1;
        int col=maxcol-mincol+1;
        return row*col;
    }
}