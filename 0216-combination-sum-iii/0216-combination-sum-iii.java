class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(1,res,new ArrayList<>(),k,n,0);
        return res;
    }
    public void backtrack(int ind,List<List<Integer>> res,ArrayList<Integer> curr,int k,int totsum,int cursum)
    {
        if(k==0 && cursum==totsum)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(k<0 || cursum>totsum || ind>9)
        {
            return;
        }
        curr.add(ind);
        backtrack(ind+1,res,curr,k-1,totsum,cursum+ind);
        curr.remove(curr.size()-1);
        backtrack(ind+1,res,curr,k,totsum,cursum);
    }
}