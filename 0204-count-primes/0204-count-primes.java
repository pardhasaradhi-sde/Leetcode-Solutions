class Solution {
    public int countPrimes(int n) {
        if(n<=2)
        {
            return 0;
        }
        boolean isprime[]=new boolean[n];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i*i<n;i++)
        {
            if(isprime[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                    isprime[j]=false;
                }
            }
        }
        int count=0;
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