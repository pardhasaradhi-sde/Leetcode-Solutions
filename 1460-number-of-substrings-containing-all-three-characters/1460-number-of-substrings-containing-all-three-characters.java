class Solution {
    public int min(int arr[])
    {
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            minimum=Math.min(arr[i],minimum);
        }
        return minimum;
    }
    public int numberOfSubstrings(String s) {
        int count=0;
        int ans[]={-1,-1,-1};
        for(int i=0;i<s.length();i++)
        {
            ans[s.charAt(i)-'a']=i;
            if(ans[0]!=-1 && ans[1]!=-1 && ans[2]!=-1)
            {
                count+=1+min(ans);
            }
        }
        return count;
    }
}