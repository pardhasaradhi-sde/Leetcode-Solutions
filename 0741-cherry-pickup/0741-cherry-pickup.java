class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][] dp = new int[n][n][n]; // dp[r1][c1][c2]
        for (int[][] a2 : dp)
            for (int[] a1 : a2)
                Arrays.fill(a1, Integer.MIN_VALUE);

        return Math.max(0, dfs(0, 0, 0, grid, dp));
    }

    private int dfs(int r1, int c1, int c2, int[][] grid, int[][][] dp) {
        int n = grid.length;
        int r2 = r1 + c1 - c2; // because steps = r1+c1 = r2+c2

        if (r1 >= n || c1 >= n || r2 >= n || c2 >= n ||
            grid[r1][c1] == -1 || grid[r2][c2] == -1)
            return -(int)1e9;

        if (r1 == n - 1 && c1 == n - 1) return grid[r1][c1];

        if (dp[r1][c1][c2] != Integer.MIN_VALUE) return dp[r1][c1][c2];

        int cherries = (c1 == c2 && r1 == r2) ? grid[r1][c1] : grid[r1][c1] + grid[r2][c2];

        int max = Integer.MIN_VALUE;
        // Both can move right or down
        int[] moves = {0, 1}; // 0: down, 1: right
        for (int dr1 : moves) {
            for (int dr2 : moves) {
                int nr1 = r1 + (dr1 == 0 ? 1 : 0);
                int nc1 = c1 + (dr1 == 1 ? 1 : 0);
                int nr2 = r2 + (dr2 == 0 ? 1 : 0);
                int nc2 = c2 + (dr2 == 1 ? 1 : 0);
                max = Math.max(max, dfs(nr1, nc1, nc2, grid, dp));
            }
        }

        return dp[r1][c1][c2] = cherries + max;
    }
}
