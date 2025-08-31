class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        rec(1,res,new ArrayList<>(),n,k);
        return res;
    }
    public void rec(int ind,List<List<Integer>> res,List<Integer> cur,int n,int k)
    {
        if(cur.size()==k)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=ind;i<=n;i++)
        {
            cur.add(i);
            rec(i+1,res,cur,n,k);
            cur.remove(cur.size()-1);
        }
    }
}