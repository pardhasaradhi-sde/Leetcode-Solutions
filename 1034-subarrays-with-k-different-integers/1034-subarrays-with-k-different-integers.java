class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int nums[],int k)
    {
        int left=0;
        int right=0;
        int count=0;
        Map<Integer,Integer> l1=new HashMap<>();
        while(right<nums.length)
        {
            l1.put(nums[right],l1.getOrDefault(nums[right],0)+1);
            while(l1.size()>k)
            {
                l1.put(nums[left],l1.getOrDefault(nums[left],0)-1);
                if(l1.get(nums[left])==0)
                {
                    l1.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}