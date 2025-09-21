class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int dp[][]=new int[nums.length][target+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return  count(0,nums,target,0,dp);
    }
    public int count(int ind,int[] nums,int target,int currsum,int [][]dp)
    {
        if(ind==nums.length)
        {
            if(target==currsum)
            {
                return 1;
            }
            return 0;
        }
        if (currsum > target) return 0;
        if(dp[ind][currsum]!=-1)
        {
            return dp[ind][currsum];
        }
        int take=count(ind+1,nums,target,currsum+nums[ind],dp);
        int not=count(ind+1,nums,target,currsum,dp);
        return dp[ind][currsum]=take+not;
    }
    
}