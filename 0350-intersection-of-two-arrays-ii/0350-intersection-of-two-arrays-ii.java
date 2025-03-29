class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m1=new HashMap<>();
        for(int num:nums1)
        {
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        for(int num:nums2)
        {
            if(m1.containsKey(num) && m1.get(num)>0)
            {
                l1.add(num);
                m1.put(num,m1.get(num)-1);
            }
        }
        int add[]=new int[l1.size()];
        for(int i=0;i<add.length;i++)
        {
            add[i]=l1.get(i);
        }
        return add;
    }
}