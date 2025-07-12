class Solution {
    public boolean ispalindrome(String s)
    {
        int low=0;
        int high=s.length()-1;
        while(low<=high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            else{
                low++;
                high--;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String s1="";
        int longest=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                int len=j-i+1;
                String str=s.substring(i,j+1);
                if(ispalindrome(str))
                {
                    if(longest<len)
                    {
                        longest=len;
                        s1=str;
                    }
                }
            }
        }
        return s1;
    }
}