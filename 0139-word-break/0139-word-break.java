class Solution {
    public boolean solve(int ind,String s,Set<String> wordDict,Boolean[] dp)
    {
        if(ind==s.length())
        {
            return true;
        }
        if(dp[ind]!=null)
        {
            return dp[ind];
        }
        for(int i=ind+1;i<=s.length();i++)
        {
            String sub=s.substring(ind,i);
            if(wordDict.contains(sub) && solve(i,s,wordDict,dp))
            {
                return dp[ind]=true;
            }
        }
        return dp[ind]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> s1=new HashSet<String>();
        for(String str:wordDict)
        {
            s1.add(str);
        }
        Boolean[] dp=new Boolean[s.length()];
        return solve(0,s,s1,dp);
    }
}