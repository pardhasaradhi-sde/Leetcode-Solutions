class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> m1=new HashSet<>();
        for(int num:nums)
        {
            m1.add(num);
        }
        int maxcount=0;
        for(int num:m1)
        {
            if(!m1.contains(num-1))
            {
                int currentnum=num;
                int count=1;
                while(m1.contains(currentnum+1))
                {
                    currentnum++;
                    count++;
                }
                maxcount=Math.max(count,maxcount);

            }
        }
        return maxcount;
            
    }
}