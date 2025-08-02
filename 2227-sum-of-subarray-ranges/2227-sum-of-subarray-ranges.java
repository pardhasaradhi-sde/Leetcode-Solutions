class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int low=nums[i];
            int high=nums[i];
            for(int j=i;j<n;j++)
            {
                low=Math.min(low,nums[j]);
                high=Math.max(high,nums[j]);
                sum+=(high-low);
            }
        }
        return sum;
    }
}