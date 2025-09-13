class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,new boolean[nums.length]);
        return res;
    }
    public void backtrack(List<List<Integer>> res,ArrayList<Integer> curr,int[] nums,boolean[] used)
    {
        if(curr.size()==nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!used[i])
            {
                curr.add(nums[i]);
                used[i]=true;
                backtrack(res,curr,nums,used);
                curr.remove(curr.size()-1);
                used[i]=false;
            }
        }
    }
}