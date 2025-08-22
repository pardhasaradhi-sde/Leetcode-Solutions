class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        char[][] arr = new char[numRows][s.length()];
        for (int i = 0; i < numRows; i++) {
            Arrays.fill(arr[i], '\0');
        }

        int row = 0, col = 0;
        boolean goingDown = true;

        for (int i = 0; i < s.length(); i++) {
            arr[row][col] = s.charAt(i);

            if (goingDown) {
                if (row == numRows - 1) {
                    goingDown = false;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    goingDown = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != '\0') {
                    st.append(arr[i][j]);
                }
            }
        }
        return st.toString();
    }
}
