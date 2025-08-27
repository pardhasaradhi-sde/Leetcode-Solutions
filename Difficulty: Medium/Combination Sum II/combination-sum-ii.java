// User function Template for Java

class Solution {
    
    public static List<List<Integer>> combinationSum2(int[] a, int s) {
        Arrays.sort(a);
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,res,new ArrayList<>(),a,s);
        return res;
    }
    public static void backtrack(int ind,List<List<Integer>> res,List<Integer> cur,int[] arr,int target)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(target<0 || ind==arr.length)
        {
            return;
        }
        cur.add(arr[ind]);
        backtrack(ind+1,res,cur,arr,target-arr[ind]);
        cur.remove(cur.size()-1);
        int next=ind+1;
        while(next<arr.length && arr[next]==arr[ind])
        {
            next=next+1;
        }
        backtrack(next,res,cur,arr,target);
    }
}