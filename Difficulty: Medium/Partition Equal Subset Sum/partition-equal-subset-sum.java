class Solution {
    static boolean equalPartition(int arr[]) {
       int sum=0;
       for(int num:arr)
       {
           sum+=num;
       }
       if((sum&1)!=0)
       {
           return false;
       }
       int target=sum/2;
       Boolean dp[][]=new Boolean[arr.length][target+1];
       return solve(0,arr,target,dp);
    }
    static boolean solve(int ind,int[] arr,int target,Boolean[][] dp)
    {
        if(target==0)
        {
            return true;
        }
        if(target<0 || ind==arr.length)
        {
            return false;
        }
        if(dp[ind][target]!=null)
        {
            return dp[ind][target];
        }
        boolean take=solve(ind+1,arr,target-arr[ind],dp);
        boolean not=solve(ind+1,arr,target,dp);
        return dp[ind][target]=take||not;
    }
}