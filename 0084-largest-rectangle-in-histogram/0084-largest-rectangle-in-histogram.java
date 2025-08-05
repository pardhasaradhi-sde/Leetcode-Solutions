class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int maxarea=0;
        for(int i=0;i<heights.length;i++)
        {
           while(!s.isEmpty() && heights[s.peek()] > heights[i])
           {
            int element=heights[s.pop()];
            int nse=i;
            int pse=s.isEmpty()?-1:s.peek();
            int area=element*(nse-pse-1);
            maxarea=Math.max(maxarea,area);
           }
           s.push(i);
        }
        while(!s.isEmpty())
        {
            int element=heights[s.pop()];
            int nse=heights.length;
            int pse=s.isEmpty()?-1:s.peek();
            maxarea=Math.max(element*(nse-pse-1),maxarea);
        }
        return maxarea;
    }
}