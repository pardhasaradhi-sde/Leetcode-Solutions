class Solution {
    private boolean ispalindrome(String str)
    {
        int start=0;
        int end=str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        backtrack(0,res,new ArrayList<>(),s);
        return res; 
    }
    public void backtrack(int ind,List<List<String>> res,List<String> cur,String s)
    {
        if(ind==s.length())
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int end=ind;end<s.length();end++)
        {
            String str=s.substring(ind,end+1);
            if(ispalindrome(str))
            {
                cur.add(str);
                backtrack(end+1,res,cur,s);
                cur.remove(cur.size()-1);
            }
        }
    }
}