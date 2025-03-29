class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    Arrays.sort(nums);
    List<Integer> l1=new ArrayList<>();
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]==nums[i-1])
        {
            l1.add(nums[i]);
        }
    }
    return l1;
    }
}