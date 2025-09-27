class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)
        {
            return "0";
        }
        StringBuilder res=new StringBuilder();
        if((numerator<0)^(denominator<0))
        {
            res.append("-");
        }
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        long div=num/den;
        res.append(div);
        long rem=num%den;
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
            rem=rem*10;
            res.append(rem/den);
            rem%=den;
        }
        return res.toString();
    }
}