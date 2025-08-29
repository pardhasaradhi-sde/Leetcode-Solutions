class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int len=1;
        int maxlen=1;
        int prevright=pairs[0][1];
        for(int i=1;i<pairs.length;i++)
        {
            int left=pairs[i][0];
            int right=pairs[i][1];
            if(prevright<left)
            {
                len++;
                prevright=right;
            }
            else{
                prevright=Math.min(prevright,right);    
            }
            maxlen=Math.max(maxlen,len);
            
        }
        return maxlen;
    }
}