class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int []arr=nums;
        int moveseven=0;
        int movesodd=0;
        for(int i=0;i<nums.length;i++)
        {
            int left=i>0?nums[i-1]:Integer.MAX_VALUE;
            int right=i<nums.length-1?nums[i+1]:Integer.MAX_VALUE;
            if((i&1)==0)
            {
               continue;
            }
            else{
                if(nums[i]>=Math.min(left,right))
                {
                    moveseven+=nums[i]-(Math.min(left,right)-1);
                }
            }   
        }
        for(int i=0;i<nums.length;i++)
        {
            int left=i>0?nums[i-1]:Integer.MAX_VALUE;
            int right=i<nums.length-1?nums[i+1]:Integer.MAX_VALUE;
            if((i&1)!=0)
            {
               continue;
            }
            else{
                if(nums[i]>=Math.min(left,right))
                {
                    movesodd+=nums[i]-(Math.min(left,right)-1);
                }
            }   
        }
        return Math.min(movesodd,moveseven);
    }
}