class Solution {
    public int search(int[] nums, int target) {
        return searchhelper(nums,target,0,nums.length-1);
    }

    private int searchhelper(int []nums,int target,int left,int right)
    {
        if(left>right)
        {
            return -1;
        }
        int mid=left+(right-left)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[left]<=nums[mid])
        {
            if(nums[left]<=target && target<=nums[mid])
            {
               return searchhelper(nums,target,left,mid-1);
            }else{
               return searchhelper(nums,target,mid+1,right);
            }
        }
        else{
            if(nums[mid]<=target && target<=nums[right])
            {
               return  searchhelper(nums,target,mid+1,right);
            }
            else{
               return searchhelper(nums,target,left,mid-1);
            }
        }
    }
}