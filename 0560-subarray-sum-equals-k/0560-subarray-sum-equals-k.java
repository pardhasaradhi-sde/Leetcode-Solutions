class Solution {
    public int subarraySum(int[] nums, int k) {
    Map<Integer,Integer> prefixsum=new HashMap<>();
    prefixsum.put(0,1);
    int currentsum=0;
    int count=0;
    for(int num:nums){
        currentsum+=num;
        if(prefixsum.containsKey(currentsum-k))
        {
            count+=prefixsum.get(currentsum-k);
        }
        prefixsum.put(currentsum,prefixsum.getOrDefault(currentsum,0)+1);
    }
    return count;
    }
    
}