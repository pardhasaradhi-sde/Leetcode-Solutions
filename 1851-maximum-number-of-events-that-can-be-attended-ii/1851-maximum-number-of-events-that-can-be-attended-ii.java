class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]); // Sort by end time
        int n = events.length;

        // dp[i][j]: max value using first i events and attending j events
        int[][] dp = new int[n + 1][k + 1];

        int[] start = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = events[i][0];
        }

        for (int i = 1; i <= n; i++) {
            int s = events[i - 1][0];
            int e = events[i - 1][1];
            int v = events[i - 1][2];

            // Binary search to find the last event that ends before this one starts
            int l = 0, r = i - 1, prev = 0;
            while (l < r) {
                int m = (l + r) / 2;
                if (events[m][1] < s) l = m + 1;
                else r = m;
            }
            prev = (events[l][1] < s) ? l + 1 : l;

            for (int j = 1; j <= k; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[prev][j - 1] + v);
            }
        }

        return dp[n][k];
    }
}
