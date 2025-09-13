class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res,ArrayList<Integer> curr,int[] nums)
    {
        if(curr.size()==nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!curr.contains(nums[i]))
            {
                curr.add(nums[i]);
                backtrack(res,curr,nums);
                curr.remove(curr.size()-1);
            }
        }
    }
}