class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // Handle edge case when k <= 1
        
        int count = 0;
        int left = 0;
        int prod = 1;

        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k && left < nums.length) {
                prod /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }

        return count;
    }
}
