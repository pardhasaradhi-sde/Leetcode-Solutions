class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(0,W,val,wt,val.length,dp); 
    }
    static int solve(int ind,int w,int val[],int wt[],int n,int [][] dp)
    {
        if(ind==n || w==0)
        {
            return 0;
        }
        if(dp[ind][w]!=-1)
        {
            return dp[ind][w];
        }
        int notpick=solve(ind+1,w,val,wt,n,dp);
        int pick=0;
        if(wt[ind]<=w)
        {
        pick=val[ind]+solve(ind+1,w-wt[ind],val,wt,n,dp);
        }
        return dp[ind][w]=Math.max(pick,notpick);
    }
}
