class Solution {
    public int minLength(String s) {
        StringBuilder s1=new StringBuilder(s);
        for(int i=0;i<s1.length()-1;i++)
        {
            char c1=s1.charAt(i);
            char c2=s1.charAt(i+1);
            if((c1=='A' && c2=='B') || (c1=='C' && c2=='D'))
            {
                s1.delete(i,i+2);
                if(i>0)
            {
                i-=2;
            }
            else{
                i-=1;
            }
            }
        }
        return s1.length();
    }
}