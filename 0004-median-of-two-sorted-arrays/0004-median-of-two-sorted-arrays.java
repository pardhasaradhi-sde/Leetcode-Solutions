class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int merged[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                merged[k++]=nums1[i++];
            }
            else{
                merged[k++]=nums2[j++];
            }
        }
        while(i<n1)
        {
            merged[k++]=nums1[i++];
        }
        while(j<n2)
        {
            merged[k++]=nums2[j++];
        }
        int low=0;
        int high=merged.length-1;
        double median;
        int mid=low+(high-low)/2;
        if((merged.length)%2==0)
        {
            median=(merged[mid]+merged[mid+1])/2.0;
        }
        else{
            median=merged[mid];
        }
        return median;
    }
}