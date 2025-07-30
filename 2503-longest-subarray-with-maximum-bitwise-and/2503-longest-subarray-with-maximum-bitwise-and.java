class Solution {
    public int longestSubarray(int[] nums) {
        int maxnum=0;
        for(int num:nums)
        {
            maxnum=Math.max(maxnum,num);
        }
        int maxlen=0;
        int currentlen=0;
        for(int num:nums)
        {
            if(num==maxnum)
            {
                currentlen++;
                maxlen=Math.max(maxlen,currentlen);
            }
            else{
                currentlen=0;
            }
        }
        return maxlen;
    }
}