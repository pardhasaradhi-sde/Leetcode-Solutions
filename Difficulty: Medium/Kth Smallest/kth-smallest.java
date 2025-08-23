// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
       PriorityQueue<Integer> p1=new PriorityQueue<>((a,b)->a-b);
       for(int n:arr)
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
