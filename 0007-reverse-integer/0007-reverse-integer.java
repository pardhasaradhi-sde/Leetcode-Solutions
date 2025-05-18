    class Solution {
        public int reverse(int x) {
            int num=x;
            int rev=0;
            int sign=(num<0)?-1:1;
            num=Math.abs(num);
            while(num>0)
            {
                int rem=num%10;
                if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
                {
                    return 0;
                }
                rev=rev*10+rem;
                num=num/10;
            }
            rev*=sign;
            return rev;
        }
    }