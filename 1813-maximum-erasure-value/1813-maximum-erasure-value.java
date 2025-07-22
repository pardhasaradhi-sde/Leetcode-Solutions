class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> l1=new HashSet<>();
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            while(l1.contains(nums[right]))
            {
                sum-=nums[left];
                l1.remove(nums[left]);
                left++;
            }
            l1.add(nums[right]);
            sum+=nums[right];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}