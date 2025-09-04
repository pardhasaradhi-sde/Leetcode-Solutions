class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int or=0;
            for(int j=i;j<nums.length;j++)
            {
                or=or|nums[j];
                if(or>=k)
                {
                    minlen=Math.min(minlen,j-i+1);
                }
            }

        }
        return minlen!=Integer.MAX_VALUE?minlen:-1;
    }
}