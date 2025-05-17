class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int i;
        int j=0;
        for(i=0;i<k;++i)
        {
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
       
        for(i=k;i<nums.length;++i)
        {
             arr[j++]=nums[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peek()<=i-k)
            {
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        arr[j++]=nums[dq.peekFirst()];
        return arr;
    }
}