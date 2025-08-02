class Solution {
    public int trap(int[] height) {
        int sum=0;
        int leftmax=0;
        int n=height.length;
        int suffix[]=new int[n];
        suffix[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
        {
            leftmax=Math.max(leftmax,height[i]);
            if(height[i]<leftmax && height[i]<suffix[i])
            {
                sum+=Math.min(leftmax,suffix[i])-height[i];
            }
        }
        return sum;
    }
}