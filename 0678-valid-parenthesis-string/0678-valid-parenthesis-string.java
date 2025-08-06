class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> leftpar=new Stack<>();
        Stack<Integer> stars=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                leftpar.push(i);
            }
            else if(ch=='*')
            {
                stars.push(i);
            }
            else{
                if(!leftpar.isEmpty())
                {
                    leftpar.pop();
                }
                else if(!stars.isEmpty())
                {
                    stars.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!leftpar.isEmpty() && !stars.isEmpty())
        {
            if(leftpar.pop()>stars.pop())
            {
                return false;
            }
        }
        return leftpar.isEmpty();
    }
}
