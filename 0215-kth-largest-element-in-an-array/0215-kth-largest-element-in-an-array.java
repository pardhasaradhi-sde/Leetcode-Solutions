class Solution {
    public int findKthLargest(int[] nums, int k) {
        int left=0;
        int right=nums.length-1;
        mergeSort(nums,left,right);
        return nums[nums.length-k];
    }
    public void mergeSort(int[] nums,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    public void merge(int[] nums,int l,int mid,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=nums[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            right[j]=nums[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                nums[k++]=left[i++];
            }else
            {
                nums[k++]=right[j++];
            }
        }
        while(i<n1)
        {
            nums[k++]=left[i++];
        }
        while(j<n2)
        {
            nums[k++]=right[j++];
        }
    }
}