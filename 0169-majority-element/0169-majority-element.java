class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int num:nums)
        {
        m1.put(num,m1.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(m1.get(nums[i])>(int)nums.length/2)
            {
                return nums[i];
            }
        }
        return -1;
    }
}