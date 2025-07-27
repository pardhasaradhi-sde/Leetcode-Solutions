class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> s1=new HashSet<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<s.length())
        {
            char c=s.charAt(right);
            while(s1.contains(c))
            {
                s1.remove(s.charAt(left));
                left++;
            }
            s1.add(c);
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}