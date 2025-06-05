class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l1=new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                l1.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++)
            {
                l1.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
            {
                l1.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
            {
                l1.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        return l1;

    }
}