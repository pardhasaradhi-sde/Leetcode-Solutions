class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
                s.pop();
            }
            else if(operations[i].equals("D"))
            {
                s.push(2*s.peek());
            }
            else if(operations[i].equals("+"))
            {
                int top=s.pop();
                int newtop=top+s.peek();
                s.push(top);
                s.push(newtop);
            }
            else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        while(!s.isEmpty())
        {
            sum+=s.pop();
        }
        return sum;
    }
}