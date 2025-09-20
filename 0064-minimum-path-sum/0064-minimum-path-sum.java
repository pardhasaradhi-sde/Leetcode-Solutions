class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(i==m-1 && j==n-1)
                {
                    dp[i][j]=grid[i][j];
                }
                else{
                    int down=(int)Math.pow(10,9),right=(int)Math.pow(10,9);
                if(i<m-1)
                {
                    down=grid[i][j]+dp[i+1][j];
                }
                if(j<n-1)
                {
                    right=grid[i][j]+dp[i][j+1];
                }
                dp[i][j]=Math.min(down,right);

                }
            }
        }
        return dp[0][0];
    }
}