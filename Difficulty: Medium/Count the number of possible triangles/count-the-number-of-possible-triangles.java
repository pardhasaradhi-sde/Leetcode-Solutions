class Solution {
    public int countTriangles(int arr[]) {
        int nums[]=arr;
        Arrays.sort(nums);
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int ind=binsearch(nums,j+1,n-1,nums[i]+nums[j]);
                if(ind!=-1)
                {
                    count+=ind-j;
                }
            }
        }
        return count;
    }
    public int binsearch(int[] nums,int start,int end,int target)
    {
        int res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<target)
            {
                res=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
}