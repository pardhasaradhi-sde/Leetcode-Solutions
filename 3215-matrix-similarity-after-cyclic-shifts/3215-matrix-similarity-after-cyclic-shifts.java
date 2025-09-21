class Solution {
    public void leftshift(int[] arr)
    {
        int n=arr.length;
        int first=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=first;
    }
    public void rightshift(int[] arr)
    {
        int n=arr.length;
        int last=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=last;
    }
    public boolean areSimilar(int[][] mat, int k) {
        int stand[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            stand[i]=Arrays.copyOf(mat[i],mat[i].length);
        }
        while(k>0)
        {
            for(int i=0;i<stand.length;i++)
            {
                if(i%2==0)
                {
                    leftshift(stand[i]);
                }
                else{
                    rightshift(stand[i]);
                }
            }
            k--;
        }
        for(int i=0;i<mat.length;i++)
        {
            if(!Arrays.equals(stand[i],mat[i]))
            {
                return false;
            }
        }
        return true;
    }
}   