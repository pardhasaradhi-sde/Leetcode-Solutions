class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int num:nums)
        {
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:m1.entrySet())
        {
            int val=entry.getValue();
            int key=entry.getKey();
            if(val>(nums.length/3))
            {
                l1.add(key);
            }
        }   
        return l1;
        }
}