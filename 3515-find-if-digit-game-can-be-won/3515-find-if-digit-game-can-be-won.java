class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice=0,bob=0,sum=0,max=0,msum=0;
        for(int num : nums)
        {
            if(num<10)
            {
                sum+=num;
            }
            if(num>=10)
            {
                msum+=num;
            }
        }
        alice=Math.max(sum,msum);
        if(alice==sum){
        bob=msum;
        }
        else{
            bob=sum;
        }

        if(alice>bob)
        {
            return true;
        }
        else 
        return false;
    }
}