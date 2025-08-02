class Solution {
    public int trap(int[] height) {
        int sum=0;
        int n=height.length;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
           while(!s.isEmpty() && height[i]>height[s.peek()])
           {
            int bottom=s.pop();
            if(s.isEmpty())
            {
                break;
            }
            int left=s.peek();
            int dist=i-left-1;
            int boundaryval=Math.min(height[i],height[left])-height[bottom];
            sum+=dist*boundaryval;
           }
           s.push(i);
        }
        return sum;
    }
}