class Solution {
    private boolean[] checkprime(int n)
    {
        boolean isprime[]=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(isprime[i])
                {
                    for(int j=i*i;j<=n;j+=i)
                    {
                        isprime[j]=false;
                    }
                }

        }
        return isprime;
    }
    public int countPrimes(int n) {
        if(n<=2)
        {
            return 0;
        }
        int count=0;
        boolean isprime[]=checkprime(n-1);
        for(int i=0;i<isprime.length;i++)
        {
            if(isprime[i])
            {
                count++;
            }
        }
        return count;
    }
}