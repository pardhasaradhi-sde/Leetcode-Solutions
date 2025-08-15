class Solution {
    public boolean ispoweroftwo(int n)
    {
        return ((n&(n-1))==0);
    }
    public boolean countofsetbits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count%2==0;
    }
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        if(ispoweroftwo(n) && countofsetbits(n-1))
        {
            return true;
        }
        return false;
    }
}