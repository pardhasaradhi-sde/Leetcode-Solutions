class Solution {
    public static boolean isRotated(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() < 2) return false;

        String leftRot = s1.substring(2) + s1.substring(0, 2);
        String rightRot = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);

        return s2.equals(leftRot) || s2.equals(rightRot);
    }
}
