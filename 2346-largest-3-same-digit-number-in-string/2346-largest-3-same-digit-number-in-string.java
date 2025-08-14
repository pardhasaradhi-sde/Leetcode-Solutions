class Solution {
    public String largestGoodInteger(String num) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=1;i<num.length()-1;i++)
        {
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i+1) )
            {
                int num1=num.charAt(i)-'0';
                if(num1>max)
                {
                    max=num1;
                    index=i-1;
                }
            }
        }
        return index!=-1?num.substring(index,index+3):"";
    }
}