// User function Template for Java

class Solution {
    public int solve(int ind,int[][] arr,int last,int dp[][])
    {
        if(ind==0)
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<=2;i++)
            {
                if(i!=last)
                {
                    max=Math.max(max,arr[ind][i]);
                }
            }
            return max;
        }
        if(dp[ind][last]!=-1)
        {
            return dp[ind][last];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=2;i++)
        {
            int points=0;
            if(i!=last)
            {
                points=arr[ind][i]+solve(ind-1,arr,i,dp);
            }
            max=Math.max(points,max);
        }
        return dp[ind][last]=max;
    }
    public int maximumPoints(int arr[][]) {
        int dp[][]=new int[arr.length][4];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(arr.length-1,arr,3,dp);
    }
}