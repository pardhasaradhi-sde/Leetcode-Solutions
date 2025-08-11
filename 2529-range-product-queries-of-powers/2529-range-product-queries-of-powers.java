class Solution {
    private static final int mod=1_000_000_007;
    private int[] generatepowers(int n)
    {
        List<Integer> l1=new ArrayList<>();
        int bit=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                l1.add(1<<bit);
            }
            bit++;
            n=n>>1;
        }
        int []powers=new int[l1.size()];
        for(int i=0;i<l1.size();i++)
        {
            powers[i]=l1.get(i);
        }
        return powers;
    }
    public int getproductinrange(int[] powers,int l,int r)
    {
        long product=1;
        for(int i=l;i<=r;i++)
        {
            product=(product*powers[i])%mod;
        }
        return (int)product;
    }
    public int[] productQueries(int n, int[][] queries) {
        int powers[]=generatepowers(n);
        int []arr=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            arr[i]=getproductinrange(powers,queries[i][0],queries[i][1]);
        }
        return arr;
    }   
}