class Solution {
    public long countSubarrays(int[] nums, int k) {
       long total=0;
       Map<Integer,Integer> prev=new HashMap<>();
       for(int num:nums)
       {
         Map<Integer,Integer> curr=new HashMap<>();
        curr.put(num,1);
        for(Map.Entry<Integer,Integer> l1:prev.entrySet())
        {
            int andval=l1.getKey()&num;
            curr.put(andval,curr.getOrDefault(andval,0)+l1.getValue());
        }
        total+=curr.getOrDefault(k,0);
        prev=curr;
       }
       return total;
    }
}
