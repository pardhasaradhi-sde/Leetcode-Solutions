class Solution {
    public int trap(int[] height) {
        int sum=0;
        int n=height.length;
        int left=0,right=height.length-1;
        int leftmax=0,rightmax=0;
        while(left<=right)
        {
            if(height[left]<=height[right])
            {
                if(height[left]>=leftmax)
                {
                    leftmax=height[left];
                }
                else{
                    sum+=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax)
                {
                    rightmax=height[right];
                }
                else{
                    sum+=rightmax-height[right];
                }
                right--;
            }

        }
        return sum;
    }
}