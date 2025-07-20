    class Solution {
        public double myPow(double x, int n) {
            long N=n;
            if(N==0)
            {
                return 1;
            }
            if(N<0)
            {
                return 1/myPow(x,(int)-N);
            }
            if(N==1)
            {
                return x;
            }
            return x*myPow(x,(int)N-1);
        }
    }