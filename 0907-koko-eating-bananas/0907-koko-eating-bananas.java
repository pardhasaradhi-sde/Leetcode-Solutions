class Solution {
    public boolean canFinish(int[] piles,int h,int minhours)
    {
        int count=0;
            for(int j=0;j<piles.length;j++)
            {
                count+=Math.ceil((double)piles[j]/minhours);
            }
            return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            high=Math.max(piles[i],high);
        }
        int ans=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canFinish(piles,h,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }
}