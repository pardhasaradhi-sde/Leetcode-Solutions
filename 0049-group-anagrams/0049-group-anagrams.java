class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> l1=new HashMap<>();
        for(String str:strs)
        {
            char c[]=str.toCharArray();
            Arrays.sort(c);
            String sortedword=new String(c);
            if(!l1.containsKey(sortedword))
            {
                l1.put(sortedword,new ArrayList<>());
            }
            l1.get(sortedword).add(str);
        }
        return new ArrayList<>(l1.values());
    }
}