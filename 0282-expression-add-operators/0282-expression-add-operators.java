import java.util.*;

class Solution {
    List<String> result = new ArrayList<>();
    int target;

    public List<String> addOperators(String num, int target) {
        this.target = target;

        // convert num string into digit array
        int n = num.length();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = num.charAt(i) - '0';
        }

        backtrack(digits, 0, 0, 0, "");
        return result;
    }

    private void backtrack(int[] digits, int pos, long curSum, long lastNum, String expr) {
        if (pos == digits.length) {
            if (curSum == target) {
                result.add(expr);
            }
            return;
        }

        long num = 0;
        for (int i = pos; i < digits.length; i++) {
            num = num * 10 + digits[i]; // build number mathematically

            // avoid leading zeros (like "05")
            if (i > pos && digits[pos] == 0) break;

            if (pos == 0) {
                // first number: no operator in front
                backtrack(digits, i + 1, num, num, "" + num);
            } else {
                // try '+'
                backtrack(digits, i + 1, curSum + num, num, expr + "+" + num);

                // try '-'
                backtrack(digits, i + 1, curSum - num, -num, expr + "-" + num);

                // try '*'
                backtrack(digits, i + 1, curSum - lastNum + lastNum * num,
                          lastNum * num, expr + "*" + num);
            }
        }
    }
}
