class Solution {
    public int largestRectangleArea(int[] heights) {
        int minheight=Integer.MAX_VALUE;
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++)
        {
            minheight=Integer.MAX_VALUE;
            for(int j=i;j<heights.length;j++)
            {
                minheight=Math.min(minheight,heights[j]);
                int width=j-i+1;
                maxarea=Math.max(maxarea,minheight*width);
            }
        }
        return maxarea;
    }
}