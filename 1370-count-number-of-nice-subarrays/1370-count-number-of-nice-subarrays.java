class Solution {
    public int sumofsubarraysequalk(int[] nums,int k)
    {
         if(k<0)
            {
                return 0;
            }
        int left=0;
        int count=0;
        int right=0;
        int sum=0;
        while(right<nums.length)
        {  
            sum+=nums[right]%2;
            while(sum>k)
            {
                sum-=nums[left]%2;
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return sumofsubarraysequalk(nums,k)-sumofsubarraysequalk(nums,k-1);
    }
}