// User function Template for Java

class Solution {
    public String calculateFraction(int a, int b) {
        if(a==0)
        {
            return "0";
        }
        StringBuilder res=new StringBuilder();
        if((a*b)<0)
        {
            res.append("-");
        }
        a=Math.abs(a);
        b=Math.abs(b);
        long div=a/b;
        res.append(div);
        long rem=a%b;
        if(rem==0)
        {
            return res.toString();
        }
        res.append(".");
        Map<Long,Integer> m1=new HashMap<>();
        while(rem!=0)
        {
            if(m1.containsKey(rem))
            {
                res.insert(m1.get(rem),"(");
                res.append(")");
                return res.toString();
            }
            m1.put(rem,res.length());
            rem*=10;
            res.append(rem/b);
            rem=rem%b;
        }
        return res.toString();
    }
}