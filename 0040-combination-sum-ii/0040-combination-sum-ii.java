class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> l1=new ArrayList<>();
        rec(0,l1,new ArrayList<>(),candidates,target,0);
        return l1;
    }
    public void rec(int ind,List<List<Integer>> l1,List<Integer> curr,int[] cand,int target,int cursum)
    {
        if(cursum==target)
        {
            l1.add(new ArrayList<>(curr));
            return;
        }
        if(cursum>target || ind==cand.length)
        {
            return;
        }
        curr.add(cand[ind]);
        rec(ind+1,l1,curr,cand,target,cursum+cand[ind]);
        curr.remove(curr.size()-1);
        int next=ind+1;
        while(next<cand.length && cand[next]==cand[ind])
        {
            next++;
        }
        rec(next,l1,curr,cand,target,cursum);
    }
}