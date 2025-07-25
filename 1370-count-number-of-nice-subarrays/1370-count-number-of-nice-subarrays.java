class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left=0;
        int count=0;
        int oddcount=0;
        int prefix=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]%2 ==1)
            {
                oddcount++;
                prefix=0;  
            }
            if(oddcount>k)
            {
                if((nums[left]%2)!=0)
                {
                    oddcount--;
                }
                left++;
            }
            while(left<right && nums[left]%2==0 && oddcount==k)
            {
                prefix++;
                left++;
            }
            if(oddcount==k)
            {
                count+=prefix+1;
            }
        }
        return count;
    }
}