class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> h1=new HashMap<>();
        int k=0;
        for(int num:nums2)
        {
            h1.put(num,k++);
        }
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int index=h1.get(nums1[i]);
            arr[i]=-1;
            for(int j=index;j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i])
                {
                    arr[i]=nums2[j];
                    break;
                }
            }
        }
        return arr;
    }
}