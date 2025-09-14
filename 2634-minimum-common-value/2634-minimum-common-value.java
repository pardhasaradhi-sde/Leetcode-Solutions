class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(int num:nums1)
        {
            s1.add(num);
        }
        Arrays.sort(nums2);
        for(int num:nums2)
        {
            if(s1.contains(num))
            {
                return num;
            }
        }
        return -1;
    }
}