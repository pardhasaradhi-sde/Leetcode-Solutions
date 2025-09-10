class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            l1.add(i);
        }
        int idx=0;
        while(l1.size()>1)
        {
            idx=(idx+k-1)%l1.size();
            l1.remove(idx);
        }
        return l1.get(0);
        
    }
}