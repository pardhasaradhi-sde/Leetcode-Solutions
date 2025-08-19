class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int left=0;
        int right=0;
        int max=1;
        while(right<s.length()-1)
        {
            if(s.charAt(right+1)==s.charAt(right)+1)
            {
                count++;
                max=Math.max(max,count);
            }
            else{
                count=1;
            left=right+1;
            }
            right++;
        }
        return max;
    }
}