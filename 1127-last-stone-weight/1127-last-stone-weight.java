class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p1=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<stones.length;i++)
        {
            p1.offer(stones[i]);
        }
        while(p1.size()!=1)
        {
            int val1=p1.poll();
            int val2=p1.poll();
            int val3=val1-val2;
            p1.offer(val3);
        }
        return p1.poll();
    }
}