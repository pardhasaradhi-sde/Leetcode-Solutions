class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> h1=new TreeSet<>();
        for(int num:nums)
        {
            h1.add(num);
        }
        int i=0;
        for(int num:h1)
        {
            nums[i]=num;
            i++;
        }
    return i;
    }
}