class Solution {
    public int arraySign(int[] nums) {
        int sum=1;
        for(int num:nums)
        {
            if(num==0)
            {
                return 0;            
            }
            if(num<0)
            {
                sum*=-1;
            }
        }
        return sum;
    }
}