class Solution {
    public static Boolean solve(int ind,int[] arr,int sum,int cursum,Boolean[][] dp)
    {
        if(sum==cursum)
        {
            return true;
        }
        if(cursum>sum || ind==arr.length)
        {
            return false;
        }
        if(dp[ind][cursum]!=null)
        {
            return dp[ind][cursum];
        }
        boolean take=solve(ind+1,arr,sum,cursum+arr[ind],dp);
        boolean nottake=solve(ind+1,arr,sum,cursum,dp);
        return dp[ind][cursum]=take||nottake;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        Boolean dp[][]=new Boolean[arr.length][sum+1];
       return solve(0,arr,sum,0,dp);
    }
}