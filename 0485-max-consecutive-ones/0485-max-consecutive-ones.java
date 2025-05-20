class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0;
        int currentcount=0;
        for(int j=0;j<nums.length;j++)
        {

            if(nums[j]==1)
            {
                currentcount++;
                maxcount=Math.max(maxcount,currentcount);
            }
            else{
                currentcount=0;
            }
            
        }
        return maxcount;
    }
}