class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArea = 0;

        // Iterate over every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If we find a '1', try to expand
                if (matrix[i][j] == '1') {
                    int minWidth = Integer.MAX_VALUE;

                    // Expand downwards row by row
                    for (int k = i; k < rows && matrix[k][j] == '1'; k++) {
                        int width = 0;

                        // Count width of current row from column j
                        while (j + width < cols && matrix[k][j + width] == '1') {
                            width++;
                        }

                        // Update minWidth seen so far
                        minWidth = Math.min(minWidth, width);

                        // Calculate area with current height and minWidth
                        int area = minWidth * (k - i + 1);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
        }

        return maxArea;
    }
}
