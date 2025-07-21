class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if(dividend==divisor)
        {
            return 1;
        }
        boolean sign=true;
        if(dividend>=0 && divisor<0)
        {
            sign=false;
        }
        if(dividend<0 && divisor>=0)
        {
            sign=false;
        }
        long divd=Math.abs((long)dividend);
        long div=Math.abs((long)divisor);
        long quotient=0;
        while(divd>=div)
        {
            int count=0;
            while(divd>=(div<<(count+1)))
            {
                count++;
            }
            quotient+=1<<count;
            divd-=(div<<count);
        }
        
        return sign?(int)quotient:(int)-quotient;
    }
}