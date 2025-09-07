class Solution {
    public int[] sumZero(int n) {
        int neg = n / 2;
        int val = 1;
        int arr[] = new int[n];
        int sign = -1;
        for (int i = 0; i < neg; i++) {
            arr[i] = val * sign;
            val++;
        }
        if (n % 2 != 0) {
            arr[neg] = 0;
        }
        val = 1; 
        for (int i = neg + (n % 2); i < n; i++) {
            arr[i] = val++;
        }
        return arr;
    }
}
