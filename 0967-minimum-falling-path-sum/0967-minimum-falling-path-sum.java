class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=(int)1e9;
         int dp[][]=new int[matrix.length][matrix[0].length];
         for(int col=0;col<matrix[0].length;col++)
         {
            dp[matrix.length-1][col]=matrix[matrix.length-1][col];
         }
        for(int row=matrix.length-2;row>=0;row--)
        {
            for(int col=0;col<matrix[0].length;col++)
            {
                int down=matrix[row][col]+dp[row+1][col];
                int diagleft=(int)1e9,diagright=(int)1e9;
                if(col>0)
                {
                    diagleft=matrix[row][col]+dp[row+1][col-1];
                }
                if(col<matrix[0].length-1)
                {
                    diagright=matrix[row][col]+dp[row+1][col+1];
                }
                dp[row][col]=Math.min(down,Math.min(diagleft,diagright));
            }
        }
        for(int col=0;col<matrix[0].length;col++)
        {
            min=Math.min(dp[0][col],min);
        }
        return min;
    }
}