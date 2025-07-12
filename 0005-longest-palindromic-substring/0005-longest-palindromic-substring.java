class Solution {
    public int spreadaround(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=spreadaround(s,i,i);
            int len2=spreadaround(s,i,i+1);
            int max=Math.max(len1,len2);
            if(max>end-start)
            {
                start=i-(max-1)/2;
                end=i+max/2;
            }
        }
        return s.substring(start,end+1);
    }
}