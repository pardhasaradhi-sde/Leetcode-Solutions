class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        rec(0,res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public void rec(int ind,List<List<Integer>> res,List<Integer> curr,int[] candidates,int target,int currsum)
    {
        if(currsum==target)
        {
            res.add(new ArrayList<>(curr));
            return ;
        }
        if(currsum>target || ind==candidates.length)
        {
            return;
        }
        curr.add(candidates[ind]);
        rec(ind,res,curr,candidates,target,currsum+candidates[ind]);
        curr.remove(curr.size()-1);
        rec(ind+1,res,curr,candidates,target,currsum);
    }
}