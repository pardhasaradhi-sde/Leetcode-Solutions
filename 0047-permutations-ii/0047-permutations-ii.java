class Solution {
    public void backtrack(List<List<Integer>> res,ArrayList<Integer> curr,int[] nums,boolean[] used)
    {
        if(curr.size()==nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1] && !used[i-1])
            {
                continue;
            }
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
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backtrack(res,new ArrayList<>(),nums,used);
        return res;
    }
}