class Solution {
    public int hammingWeight(int n) {
        StringBuilder s=new StringBuilder("");
        while(n>0)
        {
            s.append(n%2);
            n/=2;
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                count++;
            }
        }
        return count;
    }
}