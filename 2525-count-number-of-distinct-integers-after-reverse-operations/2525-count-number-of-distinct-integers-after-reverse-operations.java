class Solution {
    public int reverse(int n)
    {
        int rev=0;
        int num=n;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
                s1.add(nums[i]);
                s1.add(reverse(nums[i]));
        }
        return s1.size();
    }
}