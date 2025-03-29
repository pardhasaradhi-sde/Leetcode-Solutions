class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m1=new HashMap<>();
        for(int num:nums1)
        {
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        for(int num:nums2)
        {
            if(m1.containsKey(num))
            {
                l1.add(num);
                 m1.remove(num);
            }
           
        }
        int add[]=new int[l1.size()];
       for(int i=0;i<add.length;i++) {
        add[i]=l1.get(i);
            
        }
        return add;
    }
}