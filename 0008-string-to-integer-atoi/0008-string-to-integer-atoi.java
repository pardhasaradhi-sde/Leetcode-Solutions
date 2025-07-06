class Solution {
    public int myAtoi(String s) {
        int digit=0;
        int sign=1;
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        if(i<s.length())
        {
            char c=s.charAt(i);
            if(c=='+')
            {
                sign=1;
                i++;
            }
            else if(c=='-')
            {
                sign=-1;
                i++;
            }
        }
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int d=s.charAt(i)-'0';
            if(digit>(Integer.MAX_VALUE-d)/10)
            {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            digit=digit*10+d;
            i++;
        }

        return digit*sign;
    }
}