class Solution {
    public boolean isvalid(int n)
    {
        int num=n;
        while(num>0)
        {
            int rem=num%10;
            if(rem==0)
            {
                return false;
            }
            num=num/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int left=1,right=n;
        while(left<=right)
        {
            if(left+right==n && isvalid(left) && isvalid(right))
            {
                return new int[]{left,right};
            }
            else if(left+right>n)
            {
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}