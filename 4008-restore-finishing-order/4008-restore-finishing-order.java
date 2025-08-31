class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<order.length;i++)
        {
            for(int j=0;j<friends.length;j++)
            {
                if(order[i]==friends[j])
                {
                    l1.add(order[i]);
                    break;
                }
            }
        }
        int arr[]=new int[l1.size()];
        for(int i=0;i<l1.size();i++)
        {
            arr[i]=l1.get(i);
        }
        return arr;
    }
}