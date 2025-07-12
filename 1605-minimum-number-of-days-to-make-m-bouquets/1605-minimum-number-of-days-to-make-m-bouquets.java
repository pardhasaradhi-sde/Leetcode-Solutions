class Solution {
    public Boolean isbloomed(int[] bloomDay,int day,int k,int m)
    {
        int flowers=0;
        int boquets=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=day)
            {
                flowers++;
                if(flowers==k)
                {
                    boquets++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
        }
        return boquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k> bloomDay.length)
        {
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
            
        }
        int day=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isbloomed(bloomDay,mid,k,m))
            {
                day=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return day;
    }
}