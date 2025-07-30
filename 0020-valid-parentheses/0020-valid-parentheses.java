class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        if(s.length()<=1)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                s1.push(c);
            }
            else{
                if(s1.isEmpty())
                {
                    return false;
                }
                else if(c==')' && s1.peek()!='(')
            {
                return false;
            }
            else if(c=='}' && s1.peek()!='{')
            {
                return false;
            }
            else if(c==']' && s1.peek()!='[')
            {
                return false;
            }
            else{
                s1.pop();
            }
            }
            
        }
        return s1.isEmpty();
    }
}