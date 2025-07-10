class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char c:s.toCharArray())
        {
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> l1=new ArrayList<>(h1.entrySet());
        l1.sort((a,b)->b.getValue().compareTo(a.getValue()));
        StringBuilder s1=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:l1)
        {
            char key=entry.getKey();
            int val=entry.getValue();
            for(int i=0;i<val;i++)
            {
                s1.append(key);
            }
        }
        return s1.toString();
    }
}