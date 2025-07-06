class Solution {
    public Boolean alphanum(String s)
    {
        if(s==null || s.length()==0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!Character.isLetterOrDigit(c)  && c!='_')
            {
                return false;
            }
        }
        return true;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashMap<String,Integer> h1=new HashMap<>();
        h1.put("electronics",0);
        h1.put("grocery",1);
        h1.put("pharmacy",2);
        h1.put("restaurant",3);
        List<String[]> valid=new ArrayList<>();
        for(int i=0;i<code.length;i++)
        {
            if(alphanum(code[i]) && h1.containsKey(businessLine[i]) && isActive[i])
            {
                valid.add(new String[] {code[i],businessLine[i]});
            }
        }
        valid.sort((a,b)->{
            int cmp=Integer.compare(h1.get(a[1]),h1.get(b[1]));
            return (cmp==0) ? a[0].compareTo(b[0]) :cmp;
    });
        List<String> result =new ArrayList<>();
        for(String[] coupon:valid)
        {
            result.add(coupon[0]);
        }
        return result;
    }
}