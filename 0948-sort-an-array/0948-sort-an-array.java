class Solution {
    public static void merge(int[] arr,int[]temp,int left,int mid,int right)
    {
        for(int i=left;i<=right;i++)
        {
            temp[i]=arr[i];
        }
        int i=left,j=mid+1,k=left;
        while(i<=mid && j<=right)
        {
            if(temp[i]>temp[j])
            {
                arr[k++]=temp[j++];
            }
            else{
                arr[k++]=temp[i++];
            }
        }
        while(i<=mid)
        {
            arr[k++]=temp[i++];
        }
        while(j<=right)
        {
            arr[k++]=temp[j++];
        }
    }
    public static void mergesort(int[] nums,int[] temp,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            mergesort(nums,temp,left,mid);
            mergesort(nums,temp,mid+1,right);
            merge(nums,temp,left,mid,right);
        }
    }
    public int[] sortArray(int[] nums) {
        int temp[]=new int[nums.length];
        mergesort(nums,temp,0,nums.length-1);
        return nums;
    }
}