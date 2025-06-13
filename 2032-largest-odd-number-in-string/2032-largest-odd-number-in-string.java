class Solution {
    public String largestOddNumber(String num) {
        int max=Integer.MIN_VALUE;
        for(int i=num.length()-1;i>=0;i--)
        {
            int number=num.charAt(i)-'0';
            if((number%2)!=0)
            {
                return num.substring(0,i+1);
            }
            
        }
       
       return "";
     
    }
}