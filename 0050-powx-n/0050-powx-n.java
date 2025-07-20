    class Solution {
        public double myPow(double x, int n) {
        long exp=n;
         if(exp<0)
         {
            x=1/x;
            exp=-exp;
         }  
         return pow(x,exp);
        }
        double pow(double x,long n)
        {
            if(n==0)
            {
                return 1;
            }
            double half=pow(x,n/2);
            if(n%2==0)
            {
                return half*half;
            }
            else{
                return half*half*x;
            }
        }
    }