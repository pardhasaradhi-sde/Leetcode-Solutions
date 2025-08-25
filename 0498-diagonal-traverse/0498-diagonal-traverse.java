class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int arr[]=new int[rows*cols];
        int row=0;
        int col=0;
        boolean upright=true;
        int idx=0;
        while(idx<rows*cols)
        {
            arr[idx++]=mat[row][col];
            if(upright==true)
            {
                if(col==cols-1)
                {
                    row++;
                    upright=false;
                }
                else if(row==0)
                {
                    col++;
                    upright=false;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==rows-1)
                {
                    col++;
                    upright=true;
                }
                else if(col==0)
                {
                    row++;
                    upright=true;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}