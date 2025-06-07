class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> m1=new HashMap<>();
        int []arr=new int[2];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                m1.put(grid[i][j],m1.getOrDefault(grid[i][j],0)+1);
            }
        }
        int n=grid.length;
        for(int i=1;i<=n*n;i++)
        {
            if(m1.containsKey(i))
            {
            if(m1.get(i)==2)
            {
                arr[0]=i;
            }}
            else
            {
                arr[1]=i;
            }
        }
        return arr;
    }
}