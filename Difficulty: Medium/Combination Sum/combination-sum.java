// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
      ArrayList<ArrayList<Integer>> res=new ArrayList<>();
      backtrack(0,res,new ArrayList<>(),arr,target);
      return res;
    }
    public static void backtrack(int ind,ArrayList<ArrayList<Integer>> res, ArrayList<Integer> cur,int[] arr,int target)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(cur));
            return;

        }
        if(target<0 || ind>=arr.length)
        {
            return;
        }
        cur.add(arr[ind]);
        backtrack(ind,res,cur,arr,target-arr[ind]);
        cur.remove(cur.size()-1);
        backtrack(ind+1,res,cur,arr,target);
    }
} 