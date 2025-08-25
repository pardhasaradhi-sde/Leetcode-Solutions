class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> l1=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int num:nums)
        {
            l1.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!l1.contains(i))
            {
                l.add(i);
            }
        }
        return l;
    }
}