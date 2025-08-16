class Solution {
    public int maximum69Number (int num) {
        String s1=String.valueOf(num);
        StringBuilder s=new StringBuilder(s1);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='6')
            {
                s.setCharAt(i,'9');
                break;
            }
        }
        s1=s.toString();
        int n=Integer.parseInt(s1);
        return n;
    }
}