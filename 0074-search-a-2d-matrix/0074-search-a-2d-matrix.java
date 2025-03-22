class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int m=0;
        int n=rows*cols-1;
        while(m<=n)
        {
            int mid=m+(n-m)/2;
            int row=mid/cols;
            int col=mid%cols;
            int midval=matrix[row][col];
            if(midval==target)
            {
                return true;
            }
            else if(midval<target)
            {
                m=mid+1;
            }
            else{
                n=mid-1;
            }
        }
        return false;
    }
}