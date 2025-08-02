class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> l1=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            l1.put(nums[i],l1.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] l2=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry : l1.entrySet())
        {
            int key=entry.getKey();
            int val=entry.getValue();
            if(l2[val]==null)
            {
                l2[val]=new ArrayList<>();
            }
            l2[val].add(key);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=l2.length-1;i>=0;i--)
        {
            if(l2[i]!=null && res.size()<=k)
            {
                res.addAll(l2[i]);
            }
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=res.get(i);
        }
    return arr;
    }
}