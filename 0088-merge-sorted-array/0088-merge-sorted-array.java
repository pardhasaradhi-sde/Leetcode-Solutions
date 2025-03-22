class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1=m-1;
        int m2=n-1;
        int i=m+n-1;
        while(m1>=0 && m2>=0)
        {
            if(nums2[m2]>nums1[m1])
            {
                nums1[i]=nums2[m2];
                m2--;
                i--;
            }
            else
            {
                nums1[i]=nums1[m1];
                m1--;
                i--;
            }
        }
        while(m2>=0)
        {
            nums1[i]=nums2[m2];
            m2--;
            i--;
        }
    }
}