class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> l1=new HashMap<>();
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            if(l1.containsKey(nums[right]))
            {
                while(l1.containsKey(nums[right]))
                {
                    sum-=nums[left];
                    l1.remove(nums[left]);
                    left++;
                }
            }
            l1.put(nums[right],l1.getOrDefault(nums[right],0)+1);
            sum+=nums[right];
            maxsum=Math.max(maxsum,sum);
        }

        return maxsum;
    }
}