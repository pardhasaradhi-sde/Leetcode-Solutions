class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            return (nums[0]+nums[1])%10;
        }
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l1.add(nums[i]);
        }
        while(l1.size()>1)
        {
            ArrayList<Integer> l2=new ArrayList<>();
            for(int i=0;i<l1.size()-1;i++)
            {
                l2.add((l1.get(i)+l1.get(i+1))%10);
            }
            l1=l2;
        }
        return l1.get(0);
    }
}