class Solution {
    public void swap(int[] arr,int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,res,nums);
        return res;
    }
    public void backtrack(int ind,List<List<Integer>> res,int[] nums)
    {
        if(ind==nums.length)
        {
            ArrayList<Integer> l1=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                l1.add(nums[i]);
            }
            res.add(new ArrayList<>(l1));
            return;
        }
        for(int i=ind;i<nums.length;i++)
        {
            swap(nums,i,ind);
            backtrack(ind+1,res,nums);
            swap(nums,i,ind);
        }
    }
}