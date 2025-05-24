class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int minprod=nums[0];
        int result=maxprod;
        
        for(int i=1;i<nums.length;i++)
        {
            int curr=nums[i];
            int max=Math.max(curr,Math.max(maxprod*curr,minprod*curr));
            minprod=Math.min(curr,Math.min(maxprod*curr,minprod*curr));
            maxprod=max;
            result=Math.max(maxprod,result);
        }
        return result;
    }
}