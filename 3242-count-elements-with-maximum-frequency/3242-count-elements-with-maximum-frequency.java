class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i:nums)
        {
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        int maxfreq=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:m1.entrySet())
        {
            maxfreq=Math.max(maxfreq,entry.getValue());
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:m1.entrySet())
        {
            int freq=entry.getValue();
            if(freq==maxfreq)
            {
                count+=freq;
            }
        }
        return count;
    }
}