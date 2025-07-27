class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        leftsum[0]=0;
        rightsum[nums.length-1]=0;
        for(int i=1;i<nums.length;i++)
        {
            leftsum[i]=nums[i-1]+leftsum[i-1];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rightsum[i]=nums[i+1]+rightsum[i+1];
        }
        int pivot=0;
        for(int i=0;i<nums.length;i++)
        {
            if(leftsum[i]==rightsum[i])
            {
                return i;
            }
        }
        return -1;
    }
}