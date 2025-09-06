class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1=new ArrayList<>();
        rec(0,l1,new ArrayList<>(),nums);
        return l1;
    }
    public void rec(int ind,List<List<Integer>> fin,List<Integer> cur,int[] arr)
    {
        if(ind==arr.length)
        {
            fin.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[ind]);
        rec(ind+1,fin,cur,arr);
        cur.remove(cur.size()-1);
        rec(ind+1,fin,cur,arr);
    }
}