class Solution {
    public int[] decrypt(int[] code, int k) {
        int cop[]=Arrays.copyOf(code,code.length);
        int n=cop.length;
       if(k>0)
       {
        for(int i=0;i<cop.length;i++)
        {
            int sum=0;
            for(int j=1;j<=k;j++)
            {
             sum+=code[(i+j)%n];   
            }
            cop[i]=sum;
        }
        return cop;
       }
       cop=Arrays.copyOf(code,code.length);
       if(k<0)
       {
        for(int i=0;i<cop.length;i++)
        {
            int sum=0;
            for(int j=1;j<=-k;j++)
            {
                sum+=code[(i-j+n)%n];
            }
            cop[i]=sum;
        }
        return cop;
       }
       if(k==0)
       {
        int arr[]=new int[code.length];
        Arrays.fill(arr,0);
        return arr;
       }
       return cop;
    }
}