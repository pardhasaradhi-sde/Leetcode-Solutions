class Solution {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][][] dp = new int[rows][cols][cols];
        
        for (int[][] a2 : dp)
            for (int[] a1 : a2)
                Arrays.fill(a1, -1);
        
        // Start robots: robot1 at (0,0), robot2 at (0,cols-1)
        return cherryUtil(0, 0, cols - 1, rows, cols, grid, dp);
    }
    
    private int cherryUtil(int row, int col1, int col2, int rows, int cols, int[][] grid, int[][][] dp) {
        // Boundary check
        if (col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) return (int)-1e9;
        
        // Base case: last row
        if (row == rows - 1) {
            if (col1 == col2) return grid[row][col1];
            else return grid[row][col1] + grid[row][col2];
        }
        
        if (dp[row][col1][col2] != -1) return dp[row][col1][col2];
        
        int cherries = (col1 == col2) ? grid[row][col1] : grid[row][col1] + grid[row][col2];
        int maxCherries = Integer.MIN_VALUE;
        // All 9 possible moves for both robots
        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {
                int next = cherries+cherryUtil(row + 1, col1 + d1, col2 + d2, rows, cols, grid, dp);
                maxCherries = Math.max(maxCherries, next);
            }
        }
        
        return dp[row][col1][col2] = maxCherries;
    }
}
