class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb=new StringBuilder(s);
        int ans=0;
        if(x>y)
        {
            ans+=remove(sb,"ab",x);
            ans+=remove(sb,"ba",y);
        }
        else{
            ans+=remove(sb,"ba",y);
            ans+=remove(sb,"ab",x);
        }
        return ans;
    }
    public int remove(StringBuilder sb,String pattern,int score)
    {
        int points=0;
        for(int i=sb.length()-1;i>0;i--)
        {
            if(sb.charAt(i-1)==pattern.charAt(0) && sb.charAt(i)==pattern.charAt(1))
            {
                sb.delete(i-1,i+1);
                points+=score;
                i=Math.min(sb.length(),i+1);
            }
        }
        return points;
    }
}