class Solution {
    public int backtrack(int[][] grid,int row,int col,int totalempty,int visitedcount)
    {
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==-1)
        {
            return 0;
        }
        if(grid[row][col]==2)
        {
            return visitedcount==totalempty?1:0;
        }
        int temp=grid[row][col];
        grid[row][col]=-1;
        int count= backtrack(grid,row-1,col,totalempty,visitedcount+1)+
                    backtrack(grid,row+1,col,totalempty,visitedcount+1)+
                    backtrack(grid,row,col+1,totalempty,visitedcount+1)+
                    backtrack(grid,row,col-1,totalempty,visitedcount+1);
        grid[row][col]=temp;
        return count;
    }
    public int uniquePathsIII(int[][] grid) {
        int startrow=0;
        int startcol=0;
        int totalempty=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    startrow=i;
                    startcol=j;
                }
                if(grid[i][j]!=-1)
                {
                    totalempty=totalempty+1;
                }
            }
        }
        return backtrack(grid,startrow,startcol,totalempty,1);
    }
}