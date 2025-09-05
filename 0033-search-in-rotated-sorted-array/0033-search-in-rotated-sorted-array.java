class Solution {
    public int binsearch(int[] nums,int target,int left,int right)
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
        else{
            if(nums[left]<=nums[mid])
            {
                if(nums[left]<=target && nums[mid]>=target)
                {
                    return binsearch(nums,target,left,mid-1);
                }
                else{
                    return binsearch(nums,target,mid+1,right);
                }
            }
            else{
                if(nums[mid]<=target && nums[right]>=target)
                {
                    return binsearch(nums,target,mid+1,right);
                }
                else{
                    return binsearch(nums,target,left,mid-1);
                }
            }
        }
    }
    public int search(int[] nums, int target) {
        return binsearch(nums,target,0,nums.length-1);
    }
}