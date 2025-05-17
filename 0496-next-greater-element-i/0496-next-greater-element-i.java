class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> h1=new HashMap<>();
        int i=0;
        for(int num:nums2)
        {
            h1.put(num,i++);
        }
        int arr[]=new int[nums1.length];
        for(int j=0;j<nums1.length;j++)
        {
            int index=h1.get(nums1[j]);
            int nextgreater=-1;
            for(int k=index+1;k<nums2.length;k++)
            {
                if(nums2[k]>nums1[j])
                {
                    nextgreater=nums2[k];
                    break;
                }
            }
            arr[j]=nextgreater;
        }
        return arr;
    }
}