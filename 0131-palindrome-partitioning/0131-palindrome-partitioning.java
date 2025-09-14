class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        backtrack(res,s,new ArrayList<String>(),0);
        return res;
    }
    public boolean ispalindrome(String s)
    {
        int left=0;int right=s.length()-1;
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void backtrack(List<List<String>> res,String s,ArrayList<String> curr,int ind)
    {
        if(ind==s.length())
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<s.length();i++)
        {
            String str=s.substring(ind,i+1);
            if(ispalindrome(str))
            {
                curr.add(str);
                backtrack(res,s,curr,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
}