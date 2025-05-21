class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        int pos = 0, neg = 0;

        // Find the first positive and negative index
        while (nums[pos] < 0) pos++;
        while (nums[neg] >= 0) neg++;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index → positive
                while (nums[pos] < 0) pos++;
                res[i] = nums[pos++];
            } else {
                // Odd index → negative
                while (nums[neg] >= 0) neg++;
                res[i] = nums[neg++];
            }
        }

        return res;
    }
}
