class Solution {
    public int mergesort(int[] nums,int[] temp,int left,int right)
    {
        int mid=0;
        int count=0;
        if(right>left)
        {
            mid=left+(right-left)/2;
            count+=mergesort(nums,temp,left,mid);
            count+=mergesort(nums,temp,mid+1,right);
            count+=merge(nums,temp,left,mid+1,right);
        }
        return count;
    }
    public int merge(int [] nums,int[] temp,int left,int mid,int right)
    {
        int count=0;
        int l=left,r=mid;
        while(l<mid && r<=right)
        {
            if((long) nums[l]>2L*nums[r])
            {
                count+=(mid-l);
                r++;
            }
            else{
                l++;
            }
        }
        int i=left,j=mid,k=left;
        while(i<=mid-1 && j<=right)
        {
            if(nums[i]<nums[j])
            {
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid-1)
        {
            temp[k++]=nums[i++];
        }
        while(j<=right)
        {
            temp[k++]=nums[j++];
        }
        for(int g=left;g<=right;g++)
        {
            nums[g]=temp[g];
        }
        return count;
    }

    public int reversePairs(int[] nums) {
       int temp[]=new int[nums.length];
       return mergesort(nums,temp,0,nums.length-1);
    }
}