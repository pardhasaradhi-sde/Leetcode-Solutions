class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[]=new int[n];
        for(int i=0;i<triangle.get(n-1).size();i++)
        {
            dp[i]=triangle.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                int down=triangle.get(i).get(j)+dp[j];
                int downright=triangle.get(i).get(j)+dp[j+1];
                dp[j]=Math.min(down,downright);
            }
        }
        return dp[0];
    }
}