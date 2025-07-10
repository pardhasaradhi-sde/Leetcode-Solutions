class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> h1=new HashMap<>();
        HashSet<Character> h2=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(h1.containsKey(c))
            {
                if(h1.get(c)!=d)
                {
                    return false;
                }
            }
            else{
                if(h2.contains(d))
                {
                    return false;   
                }
                h1.put(c,d);
                h2.add(d);
            }
           
        }
        
        return true;
    }
}