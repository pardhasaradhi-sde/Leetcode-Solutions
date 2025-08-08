class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2])
        {
            return "none";
        }
        Map<Integer,Integer> l1=new HashMap<>();
        for(int num:nums)
        {
            l1.put(num,l1.getOrDefault(num,0)+1);
        }
        if(l1.size()==1)
        {
            return "equilateral";
        }
        else if(l1.size()==2)
        {
            return "isosceles";
        }
        else if(l1.size()==3)
        {
            return "scalene";
        }
        return "none";
    }
}