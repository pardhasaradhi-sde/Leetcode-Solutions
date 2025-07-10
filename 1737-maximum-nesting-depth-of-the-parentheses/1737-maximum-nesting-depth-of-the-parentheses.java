class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int open=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                open++;
                depth=Math.max(depth,open);
            }
            else if(c==')')
            {
                open--;
            }
        }
        return depth;
    }
}