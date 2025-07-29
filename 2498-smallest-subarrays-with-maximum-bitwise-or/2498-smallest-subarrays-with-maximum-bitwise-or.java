class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int arr[]=new int[nums.length];
        int bits[]=new int[32];
        Arrays.fill(bits,-1);
        for(int i=nums.length-1;i>=0;i--)
        {
            int subarraysize=1;
            for(int j=0;j<32;j++)
            {
                if((nums[i]&(1<<j))!=0)
                {
                    bits[j]=i;
                }
                else if(bits[j]!=-1)
                {
                    subarraysize=Math.max(subarraysize,bits[j]-i+1);
                }
            }
            arr[i]=subarraysize;
        }
        return arr;
    }
}