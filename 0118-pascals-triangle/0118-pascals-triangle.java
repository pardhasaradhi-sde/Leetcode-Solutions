class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> l1=new ArrayList<>();
    for(int i=0;i<numRows;i++)
    {
        List<Integer> l2=new ArrayList<>();
        for(int j=0;j<=i;j++)
        {
            if(j==0 || j==i)
            {
                l2.add(1);
            }
            else{
                int val=l1.get(i-1).get(j-1)+l1.get(i-1).get(j);
                l2.add(val);
            }
            
        }
        l1.add(l2);
    }
    return l1;
    }
}