class Solution {
    public int countPoints(String rings) {
        Map<Character,Set<Character>> m1=new HashMap<>();
        for(int i=0;i<rings.length()-1;i+=2)
        {
            if(!m1.containsKey(rings.charAt(i+1)))
                {
                    m1.put(rings.charAt(i+1),new HashSet<>());
                }
            m1.get(rings.charAt(i+1)).add(rings.charAt(i));
        }
        int count=0;
        for(Set<Character> s:m1.values())
        {
            if(s.size()==3)
            {
                count++;
            }
        }
        return count;
    }
}