class Solution {
    public int solve(int start,int end,int[] arr,int[] dp)
    {
        if(start>=end)
        {
            return 0;
        }
        if(dp[start]!=-1)
        {
            return dp[start];
        }
        int take=solve(start+2,end,arr,dp)+arr[start];
        int not=solve(start+1,end,arr,dp);
        return dp[start]=Math.max(take,not);
    }
    int maxValue(int[] arr) {
      if(arr.length==0)
      {
          return 0;
      }
      if(arr.length==1)
      {
          return arr[0];
      }
      if(arr.length==2)
      {
          return Math.max(arr[0],arr[1]);
      }
      int dp1[]=new int[arr.length];
      Arrays.fill(dp1,-1);
      int plusone=solve(1,arr.length,arr,dp1);
      int dp2[]=new int[arr.length];
      Arrays.fill(dp2,-1);
      int start=solve(0,arr.length-1,arr,dp2);
      return Math.max(plusone,start);
    }
}
