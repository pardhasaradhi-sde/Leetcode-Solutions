class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p1=new PriorityQueue<>((a,b)->b-a);
        for(int n:nums)
        {
            p1.offer(n);
        }
        for(int i=0;i<k-1;i++)
        {
            p1.poll();
        }
        return p1.poll();
    }
}