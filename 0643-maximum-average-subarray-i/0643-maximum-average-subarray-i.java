class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=Double.NEGATIVE_INFINITY;
        int left=0;
        double sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            if(right-left+1>k)
            {
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k)
            {
                double avg=sum/k;
                maxsum=Math.max(avg,maxsum);
            }
        }
        return maxsum;
    }
}