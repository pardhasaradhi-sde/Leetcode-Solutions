class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate(new StringBuilder(),n,0,0,res);
        return res;
    }
    public void generate(StringBuilder str,int n,int open,int close,List<String> res)
    {
        if(str.length()==n*2)
        {
            res.add(str.toString());
            return;
        }
        if(open<n)
        {
            generate(str.append("("),n,open+1,close,res);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open)
        {
            generate(str.append(")"),n,open,close+1,res);
            str.deleteCharAt(str.length()-1);
        }
    }
}