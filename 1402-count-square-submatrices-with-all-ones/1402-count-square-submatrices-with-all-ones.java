class Solution {
    public int countSquares(int[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length;
        int total=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==1)
                {
                    int maxsize=Math.min(rows-i,cols-j);
                    for(int k=1;k<=maxsize;k++)
                    {
                        if(issquare(matrix,i,j,k))
                        {
                            total++;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
        return total;
    }
    private boolean issquare(int[][] matrix,int row,int col,int size)
    {
        for(int i=row;i<row+size;i++)
        {
            for(int j=col;j<col+size;j++)
            {
                if(matrix[i][j]==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}