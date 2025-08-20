class Solution {
    public long findScore(int[] nums) {
       int n=nums.length;
       long score=0;
       boolean [] bool=new boolean[nums.length];
       Arrays.fill(bool,false);
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
        if(a[0]!=b[0]) return a[0]-b[0];
        return a[1]-b[1];});
       for(int i=0;i<nums.length;i++)
       {
        pq.offer(new int[]{nums[i],i});
       }
       while(!pq.isEmpty())
       {
        int cur[]=pq.poll();
        int val=cur[0];
        int idx=cur[1];
        if(bool[idx])
        {
            continue;
        }
        score+=val;
        bool[idx]=true;
        if(idx-1>=0)bool[idx-1]=true;
        if(idx+1<nums.length)bool[idx+1]=true;
       }
       return score;
    }
}
