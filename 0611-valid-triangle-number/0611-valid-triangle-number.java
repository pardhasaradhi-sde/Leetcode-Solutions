class Solution {
    public int triangleNumber(int[] nums) {
       Arrays.sort(nums);
       int count=0;
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
        if(nums[i]==0)
        {
            continue;
        }
        for(int j=i+1;j<n;j++)
        {
            int ind=binarysearch(nums,i+1,n-1,nums[i]+nums[j]);
            if(ind!=-1)
            {
                count+=ind-j;
            }
        }
       }
       return count;
    }
    public int binarysearch(int[] nums,int l,int r,int target)
    {
        int res=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]<target)
            {
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}
