class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    // Backtracking solver
    public boolean solve(char[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] == '.') {
                    // Try numbers 1 to 9
                    for(char num = '1'; num <= '9'; num++) {
                        if(isValidSudoku(board, row, col, num)) {
                            board[row][col] = num; // place number
                            if(solve(board)) return true; // recurse
                            board[row][col] = '.'; // backtrack
                        }
                    }
                    return false; // no valid number found
                }
            }
        }
        return true; // all cells filled
    }

    // Check if placing 'num' at (row, col) is valid
    public boolean isValidSudoku(char[][] board, int row, int col, char num) {
        int m = 9;
        int n = 9;

        // Check entire row
        for(int j = 0; j < n; j++) {
            if(board[row][j] == num) return false;
        }

        // Check entire column
        for(int i = 0; i < m; i++) {
            if(board[i][col] == num) return false;
        }

        // Check 3x3 subgrid using your approach
        int sr = 3 * (row / 3);
        int er = sr + 2;
        int sc = 3 * (col / 3);
        int ec = sc + 2;

        return isvalid(board, sr, er, sc, ec, num);
    }

    // Check if 'num' exists in the 3x3 subgrid
    public boolean isvalid(char[][] board, int sr, int er, int sc, int ec, char num) {
        for(int i = sr; i <= er; i++) {
            for(int j = sc; j <= ec; j++) {
                if(board[i][j] == num) return false;
            }
        }
        return true;
    }
}
