class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int total = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    int maxSize = Math.min(m - i, n - j);
                    for (int size = 1; size <= maxSize; size++) {
                        if (isSquare(matrix, i, j, size)) {
                            total++;
                        } else {
                            break; // stop expanding further
                        }
                    }
                }
            }
        }

        return total;
    }

    private boolean isSquare(int[][] mat, int r, int c, int size) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (mat[i][j] == 0) return false;
            }
        }
        return true;
    }
}
