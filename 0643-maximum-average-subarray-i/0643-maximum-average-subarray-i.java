class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        double sum=0;
        while(right<nums.length)
        {
            if(right-left+1>k)
            {
                sum-=nums[left];
                left++;
            }
            sum+=nums[right];
            if(right-left+1==k)
            {
                double avg=sum/k;
                maxsum=Math.max(avg,maxsum);
            }
            right++;
        }
        return maxsum;
    }
}