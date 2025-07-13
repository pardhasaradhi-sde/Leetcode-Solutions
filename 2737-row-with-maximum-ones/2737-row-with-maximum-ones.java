class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[]=new int[2];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            int ones=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    ones++;
                }
            }
            if(max<ones)
            {
                max=ones;
                arr[0]=i;
                arr[1]=ones;
            }
        }
        return arr;
    }
}