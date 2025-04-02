class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> m1=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        for(int num:nums)
        {
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : m1.entrySet())
        {
            if(m.getValue()>nums.length/3)
            {
                l1.add(m.getKey());
            }
        }
        return l1;
    }
}