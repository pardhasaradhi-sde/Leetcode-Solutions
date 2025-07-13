class Solution {
    public int countstu(int[] nums,int pages)
    {
        int student=1;
        int pagescount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(pagescount+nums[i]<=pages)
            {
                pagescount+=nums[i];
            }
            else{
                student++;
                pagescount=nums[i];
            }
        }
        return student;
    }
    public int splitArray(int[] nums, int k) {
        if(nums.length<k)
        {
            return -1;
        }
        int min=Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.max(min,nums[i]);
            max+=nums[i];
        }
        int ans=max;
        while(min<=max)
        {
            int mid=min+(max-min)/2;
            int studentcount=countstu(nums,mid);
            if(studentcount<=k)
            {
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
}