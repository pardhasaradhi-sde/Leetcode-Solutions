// User function Template for Java
class Solution {
    int minCost(int[] height) {
       int n=height.length;
       int []dp=new int[height.length];
        dp[0]=0;
       for(int i=1;i<n;i++)
       {
           int cost1=dp[i-1]+Math.abs(height[i]-height[i-1]);
           int cost2=Integer.MAX_VALUE;
           if(i>1)
           {
               cost2=dp[i-2]+Math.abs(height[i]-height[i-2]);
           }
           dp[i]=Math.min(cost1,cost2);
       }
       return dp[n-1];
    }
}