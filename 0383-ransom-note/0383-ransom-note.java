class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(char c:ransomNote.toCharArray())
        {
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        for(char c:magazine.toCharArray())
        {
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        for(char c:m1.keySet())
        {
            if(!(m1.get(c)<=m2.getOrDefault(c,0)))
            {
                return false;
            }
        }
        return true;
    }
}