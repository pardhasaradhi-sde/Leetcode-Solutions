class Solution {
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
        rotateing(nums,0,nums.length-1);
        rotateing(nums,0,k-1);
        rotateing(nums,k,nums.length-1);
    }
    public void rotateing(int []nums,int si,int ei)
    {
        while(si<=ei)
        {
            int temp=nums[ei];
            nums[ei]=nums[si];
            nums[si]=temp;
            si++;
            ei--;
        }
    }
}