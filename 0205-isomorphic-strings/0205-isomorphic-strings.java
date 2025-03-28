class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Character> m1=new HashMap<>();
        Map<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           char chars=s.charAt(i);
           char chart=t.charAt(i);
           if(m1.containsKey(chars))
           {
            if(m1.get(chars)!=chart)
            {
                return false;
            }
            }
            else{
                m1.put(chars,chart);
            }
           if(m2.containsKey(chart))
           {
            if(m2.get(chart)!=chars)
            {
                return false;
            }
           }
            else{
                m2.put(chart,chars);
            }
        }
        return true;
        
    }
}