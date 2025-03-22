class Solution {
    public String reverseWords(String s) {
    StringBuilder s2=new StringBuilder();
    int last=s.length()-1;
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
            s2.append(s.substring(start+1,last+1)).append(' ');
            last=start-1;
        }
    }
    return s2.toString().trim();
    }
}