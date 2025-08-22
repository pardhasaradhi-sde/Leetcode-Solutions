class Solution {
    public int movesToMakeZigzag(int[] nums) {
        // Variables to store total moves for two possible zigzag patterns
        // moveseven -> pattern where even indices are peaks
        int moveseven = 0;
        // movesodd  -> pattern where odd indices are peaks
        int movesodd = 0;
        int n = nums.length;
        // CASE 1: Even indices are PEAKS
        // Valley positions are odd indices
        for (int i = 0; i < n; i++) {
            // Determine neighbors
            int left = (i > 0) ? nums[i - 1] : Integer.MAX_VALUE;      // left neighbor (or INF if i==0)
            int right = (i < n - 1) ? nums[i + 1] : Integer.MAX_VALUE; // right neighbor (or INF if i==n-1)

            if ((i & 1) == 0) {
                // Even index -> peak, no decrease needed
                continue;
            } else {
                // Odd index -> valley
                // Check if current value violates valley condition (must be smaller than both neighbors)
                if (nums[i] >= Math.min(left, right)) {
                    // Compute moves required to make it strictly less than both neighbors
                    // Largest value allowed at valley = min(left, right) - 1
                    moveseven += nums[i] - (Math.min(left, right) - 1);
                }
            }   
        }
        // CASE 2: Odd indices are PEAKS
        // Valley positions are even indices
        for (int i = 0; i < n; i++) {
            // Determine neighbors
            int left = (i > 0) ? nums[i - 1] : Integer.MAX_VALUE;
            int right = (i < n - 1) ? nums[i + 1] : Integer.MAX_VALUE;

            if ((i & 1) != 0) {
                // Odd index -> peak, no decrease needed
                continue;
            } else {
                // Even index -> valley
                // Check if current value violates valley condition
                if (nums[i] >= Math.min(left, right)) {
                    // Compute moves required to make it strictly less than neighbors
                    movesodd += nums[i] - (Math.min(left, right) - 1);
                }
            }   
        }
        // Return the minimum moves from both possible zigzag patterns
        return Math.min(moveseven, movesodd);
    }
}
