class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long len=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                len++;
            }
            else{
                count+=(len*(len+1))/2;
                len=0;
            }
        }
        count+=(len*(len+1))/2;
        return count;
    }
}