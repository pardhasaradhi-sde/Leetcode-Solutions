class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        int ones=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
                ones++;
            }
            while(ones>1)
            {
                if(nums[left]==0)
                {
                    ones--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left);
            right++;
        }
        return maxlen;
    }
}