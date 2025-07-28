class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> l1=new HashMap<>();
        for(String str:strs)
        {
            int count[]=new int[26];
            for(char c:str.toCharArray())
            {
               count[c-'a']++;
            } 
            StringBuilder sb=new StringBuilder();
            for( int freq:count)
            {
                sb.append(freq).append('#');
            }
            String key=sb.toString();
            if(!l1.containsKey(key))
            {
                l1.put(key,new ArrayList<>());
            }
            l1.get(key).add(str);
        }
        return new ArrayList<>(l1.values());
    }
}