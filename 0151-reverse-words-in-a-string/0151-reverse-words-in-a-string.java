class Solution {
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        int right=s.length()-1;
        while(right>=0)
        {
            while(right>=0 && s.charAt(right)==' ')
            {
                right--;
            }
            if(right<0)
            {
                break;
            }
            int left=right;
            while(left>=0 && s.charAt(left)!=' ')
            {
                left--;
            }
            s1.append(s.substring(left+1,right+1));
            s1.append(' ');
            right=left-1;

        }
        return s1.toString().trim();
    }
}