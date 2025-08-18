class Solution {
    final long mod=1000000007;
    public long recu(long  a,long  b)
    {
        if(b==0)
        {
            return 1;
        }
        long  half=recu(a,b/2);
        long res=(half*half)%mod;
        if(b%2==1)
        {
            res=(res*a)%mod;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
       return (int)((recu(5, (n + 1) / 2) * recu(4, n / 2)) % mod);
    }
}