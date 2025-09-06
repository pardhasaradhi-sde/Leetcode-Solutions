class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1=new StringBuilder(s);
        StringBuilder s2=new StringBuilder(t);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='#' )
            {
                if(i>0)
                {
                    s1.deleteCharAt(i-1);
                    i--;
                }
                s1.deleteCharAt(i);
                i--;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='#')
            {
                if(i>0)
                {
                    s2.deleteCharAt(i-1);
                    i--;
                }
                s2.deleteCharAt(i);
                i--;
            }
        }
        return s1.toString().equals(s2.toString());
    }
}