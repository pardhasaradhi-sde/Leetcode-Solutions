class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        int last=n-1;
        while(last>=0)
        {
            if(s.charAt(last)==' ')
            {
                last--;
            }
            else{
                int start=last;
                while(start>=0 && s.charAt(start)!=' ')
                {
                    start--;
                }
                s1.append(s.substring(start+1,last+1)).append(" ");
                last=start-1;
            }
        }
        return s1.toString().trim();
    }
}