class Solution {
    public int findTheWinner(int n, int k) {
        ArrayDeque<Integer> l1=new ArrayDeque<>();
        for(int i=1;i<=n;i++)
        {
            l1.offer(i);
        }
        while(l1.size()>1)
        {
            for(int i=0;i<k-1;i++)
            {
                int ele=l1.removeFirst();
                l1.addLast(ele);
            }
            l1.removeFirst();
        }
        return l1.removeFirst();
        
    }
}