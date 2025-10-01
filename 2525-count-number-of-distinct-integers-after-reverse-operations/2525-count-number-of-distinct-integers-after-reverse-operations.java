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
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!s1.contains(nums[i]))
            {
                s1.add(nums[i]);
            count++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            int rev=reverse(nums[i]);
            if(!s1.contains(rev))
            {
                s1.add(rev);
                count++;
            }
        }
        return count;
    }
}