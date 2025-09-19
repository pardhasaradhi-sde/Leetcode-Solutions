class Solution {
    public boolean wordPattern(String pattern, String s) {
        String parts[]=s.split(" ");
        if(pattern.length()!=parts.length)
        {
            return false;
        }
        Map<Character,String> m1=new HashMap<>();
        Map<String,Character> m2=new HashMap<>();
        int i=0;
        for(char c:pattern.toCharArray())
        {
            if(!m1.containsKey(c))
            {
                m1.put(c,parts[i]);
            }
            else{
                if(!m1.get(c).equals(parts[i]))
                {
                    return false;
                }
            }
            if(!m2.containsKey(parts[i]))
            {
                m2.put(parts[i],c);
            }
            else{
                if(m2.get(parts[i])!=c)
                {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}