class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> l1=new ArrayList<>();
    Set<Integer> s=new HashSet<>();
    for(int num:nums)
    {
        if(s.contains(num))
        {
            l1.add(num);
        }
        s.add(num);
    }
    return l1;
    }
}