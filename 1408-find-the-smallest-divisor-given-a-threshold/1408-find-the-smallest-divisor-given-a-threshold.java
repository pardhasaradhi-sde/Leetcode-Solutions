class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }
        int low=1;
        int smalldiv=Integer.MAX_VALUE;
        while(low<=max)
        {
            int mid=low+(max-low)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum<=threshold)
            {
                smalldiv=mid;
                max=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return smalldiv;
    }
}