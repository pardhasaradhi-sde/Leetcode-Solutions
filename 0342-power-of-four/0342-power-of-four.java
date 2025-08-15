class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        for(int i=0;i<=30;i+=2)
        {
            if(n==(1<<i))
            {
                return true;
            }
        }
        return false;
    }
}