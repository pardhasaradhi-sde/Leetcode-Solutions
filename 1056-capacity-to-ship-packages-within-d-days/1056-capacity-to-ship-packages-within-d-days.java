class Solution {
    public boolean canship(int[] weights,int cap,int days)
    {
        int daysused=1;
        int total=0;
        for(int w:weights)
        {
            if(total+w>cap)
            {
                daysused++;
                total=0;
            }
            total+=w;
        }
        return daysused<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++)
        {
            low=Math.max(weights[i],low);
            high+=weights[i];
        }
        int ans=high;
        while(low<=high)
        {   
            int mid=low+(high-low)/2;

                if(canship(weights,mid,days))
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