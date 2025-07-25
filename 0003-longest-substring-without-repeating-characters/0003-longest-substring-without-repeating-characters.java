class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m1=new HashMap<>();
        int left=0;
        int maxlen=0;
        int len=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            if(m1.containsKey(c))
            {
                left=Math.max(left,m1.get(c)+1);
            }
            len=right-left+1;
            maxlen=Math.max(len,maxlen);
            m1.put(c,right);
        }
        return maxlen;
    }
}