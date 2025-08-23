class Solution {
    public int minLength(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int n=s1.length();
            if(n>0 && ((s1.charAt(n-1)=='A' && s.charAt(i)=='B') || (s1.charAt(n-1)=='C' && s.charAt(i)=='D')))
            {
                s1.deleteCharAt(n-1);
            }
            else{
                s1.append(s.charAt(i));
            }
        }
        return s1.length();
    }
}