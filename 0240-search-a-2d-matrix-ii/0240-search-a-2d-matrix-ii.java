class Solution {
    public boolean binarysearch(int[] matrix,int target)
    {
        int low=0;
        int high=matrix.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(matrix[mid]==target)
            {
                return true;
            }
            else if(matrix[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            boolean ispresent=binarysearch(matrix[i],target);
            if(ispresent)
            {
                return true;
            }
        }
        return false;
    }

}