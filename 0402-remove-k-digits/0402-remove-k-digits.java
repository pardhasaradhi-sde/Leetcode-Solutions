class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char val=num.charAt(i);
            while(!s.isEmpty() && k>0 && s.peek()>val)
            {
                s.pop();
                k--;
            }
            s.push(val);
        }
        while(k>0)
        {
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }
}