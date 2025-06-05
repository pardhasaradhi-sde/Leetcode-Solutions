class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r:row)
        {
            for(int c=0;c<matrix[0].length;c++)
            {
                matrix[r][c]=0;
            }
        }
        for(int r=0;r<matrix.length;r++)
        {
            for(int c:col)
            {
                matrix[r][c]=0;
            }
        }
    }
}