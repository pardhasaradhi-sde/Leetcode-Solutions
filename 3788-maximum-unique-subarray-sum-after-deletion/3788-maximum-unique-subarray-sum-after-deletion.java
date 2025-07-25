class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int result=0;
        for(int num:s)
        {
            if(num>0)
            {
                result+=num;
            }
        }
        if(result==0)
        {
            result=Collections.max(s);
        }
        return result;
        }
}