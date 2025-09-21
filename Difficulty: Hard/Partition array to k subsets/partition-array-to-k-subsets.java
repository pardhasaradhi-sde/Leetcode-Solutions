/*You are required to complete this method */
class Solution {
    public boolean isKPartitionPossible(int[] arr, int k) {
     int sum=Arrays.stream(arr).sum();
     if(sum%k!=0)
     {
         return false;
     }
     int target=sum/k;
     boolean used[]=new boolean[arr.length];
     return solve(0,arr,k,target,used,target);
    }
    public boolean solve(int ind,int[] arr,int k,int remaining,boolean[] used,int target)
    {
        if(k==1)
        {
            return true;
        }
        if(remaining==0)
        {
            return solve(0,arr,k-1,target,used,target);
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(!used[i] && target>=arr[i])
            {
                used[i]=true;
                if(solve(i+1,arr,k,remaining-arr[i],used,target))
                {
                    return true;
                }
                used[i]=false;
            }
        }
        return false;
    }
}