// User function Template for Java

class Solution {
    public static boolean check(int ind,int[] arr,int totalsum,int cursum)
    {
        if(cursum==totalsum)
        {
            return true;
        }
        if(cursum>totalsum || ind==arr.length)
        {
            return false;
        }
        if(check(ind+1,arr,totalsum,cursum+arr[ind]))
        {
            return true;
        }
        return check(ind+1,arr,totalsum,cursum);
    }
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
       return check(0,arr,K,0);
    }
}
