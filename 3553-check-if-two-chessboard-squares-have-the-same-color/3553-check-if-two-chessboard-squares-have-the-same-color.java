class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int index1=(coordinate1.charAt(0)-'a'+coordinate1.charAt(1)-'1')%2;
        int index2=(coordinate2.charAt(0)-'a'+coordinate2.charAt(1)-'1')%2;
        return index1==index2;
    }
}