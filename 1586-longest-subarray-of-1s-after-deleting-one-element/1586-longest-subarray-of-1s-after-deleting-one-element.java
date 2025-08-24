class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        int ones=0;
        int curlen=0;
        while(right<nums.length)
        {
            if(nums[right]==0 && ones==1)
            {
                while(nums[left]==1)
                {
                    curlen--;
                    left++;
                }
                curlen--;
                ones=0;
                left++;
            }
            if(nums[right]==1 || (nums[right]==0 && ones!=1))
            {
                curlen++;
                if(nums[right]==0)
                {
                    ones=1;
                }
            }
            maxlen=Math.max(curlen,maxlen);
            right++;
        }
        return maxlen-1;
    }
}