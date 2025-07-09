class Solution {
    final long mod=1000000007;
    public long recurse(long base,long exp)
    {
        if(exp==0)
        {
            return 1;
        }
        long half=recurse(base,exp/2);
        if(exp%2==1)
        {
            return (half*half*base)%mod;
        }
        return (half*half)%mod;

    }
    public int countGoodNumbers(long n) {
        long evencount=(n+1)/2;
        long oddcount=n/2;
        return (int)(recurse(5,evencount)*recurse(4,oddcount)%mod);
    }
}
