class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> prev=new  HashSet<>();
        Set<Integer> All=new HashSet<>();
        for(int num:arr)
        {
            Set<Integer> cur=new HashSet<>();
            cur.add(num);
            for(int x:prev)
            {
                cur.add(x|num);
            }
            All.addAll(cur);
            prev=cur;
        }
        return All.size();
    }
}