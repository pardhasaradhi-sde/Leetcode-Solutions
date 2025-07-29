class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l1=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int index=0;
        for(int num=1;num<=n;num++)
        {   
            if(index==target.length)
            {
                break;
            }
            s.push(num);
            l1.add("Push");
            if(s.peek()==target[index])
            {
               index++;
            }
            else{
                s.pop();
                l1.add("Pop");

            }
        }
        return l1;
    }
}