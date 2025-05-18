class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        while(min>0 && max>0)
        {
            if(min>max)
            {
                min=min%max;
            }else{
                max=max%min;
            }
        }
        if(min==0)
        {
            return max;
        }
        return min;
    }


}