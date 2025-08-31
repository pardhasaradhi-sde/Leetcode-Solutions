class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int arr[]=new int[friends.length];
        Set<Integer> s=new HashSet<>();
        for(int fr:friends)
        {
            s.add(fr);
        }
        int k=0;
        for(int i=0;i<order.length;i++)
        {
            if(s.contains(order[i]))
            {
                arr[k++]=order[i];
            }
        }
        return arr;
    }
}