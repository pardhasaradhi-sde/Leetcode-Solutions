class Solution {
    public void nearlySorted(int[] arr, int k) {
       PriorityQueue<Integer> l1=new PriorityQueue<>((a,b)->a-b);
       for(int n:arr)
       {
           l1.offer(n);
       }
       for(int i=0;i<arr.length;i++)
       {
            arr[i]=l1.poll();   
       }
    }
}
