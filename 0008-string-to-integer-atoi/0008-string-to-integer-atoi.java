class Solution {
    public int myAtoi(String s) {
        return parse(s,0,1,false,0);
    }
    public int parse(String s,int num,int sign,boolean signseen,int i)
    {
        if(i>=s.length())
        {
            return num*sign;
        }
        char c=s.charAt(i);
        if(!signseen && c==' ')
        {
            return parse(s,num,sign,false,i+1);
        }
        if(!signseen && (c=='+' || c=='-'))
        {
            sign=(c=='-')?-1:1;
            return parse(s,num,sign,true,i+1);
        }
        if(Character.isDigit(c))
        {
            int d=c-'0';
            if(num>(Integer.MAX_VALUE-d)/10)
            {
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            return parse(s,num*10+d,sign,true,i+1);
            
        }
        return num*sign;
    }
}