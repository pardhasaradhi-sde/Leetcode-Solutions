class Solution {
    public int solve(int ind,int[] arr,int[] dp)
    {
        if(ind>=arr.length)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int take=solve(ind+2,arr,dp)+arr[ind];
        int leave=solve(ind+1,arr,dp);
        return dp[ind]=Math.max(take,leave);
    }
    public int findMaxSum(int arr[]) {
      int []dp=new int[arr.length];
      Arrays.fill(dp,-1);
      return solve(0,arr,dp);
    }
}