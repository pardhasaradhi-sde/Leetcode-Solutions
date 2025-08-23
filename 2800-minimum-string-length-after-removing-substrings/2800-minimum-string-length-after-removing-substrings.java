class Solution {
    public int minLength(String s) {
        Stack<Character> s1=new Stack();
        for(int i=0;i<s.length();i++)
        {
            int n=s1.size();
            if(n>0 && ((s1.peek()=='A' && s.charAt(i)=='B') || (s1.peek()=='C' && s.charAt(i)=='D')))
            {
                s1.pop();
            }
            else{
                s1.push(s.charAt(i));
            }
        }
        return s1.size();
    }
}