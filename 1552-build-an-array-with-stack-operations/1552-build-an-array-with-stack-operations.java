class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l1=new ArrayList<>();
        int index=0;
        for(int num=1;num<=n;num++)
        {   
            if(index==target.length)
            {
                break;
            }
            if(num==target[index])
            {
                l1.add("Push");
                index++;
            }
            else{
                l1.add("Push");
                l1.add("Pop");

            }
        }
        return l1;
    }
}