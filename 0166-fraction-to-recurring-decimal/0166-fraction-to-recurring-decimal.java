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
        long remainder=num%den;
        res.append(num/den);
        if(remainder==0)
        {
            return res.toString();
        }
        res.append(".");
        Map<Long,Integer> map=new HashMap<>();
        while(remainder!=0)
        {
            if(map.containsKey(remainder))
            {
                int pos=map.get(remainder);
                res.insert(pos,"(");
                res.append(")");
                break;
            }
            map.put(remainder,res.length());
            remainder*=10;
            res.append(remainder/den);
            remainder%=den;
        }
        return res.toString();
    }
}