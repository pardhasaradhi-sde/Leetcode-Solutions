class Solution {
    public String sortVowels(String s) {
        Map<Character,Integer> l1=new HashMap<>();
        l1.put('A',10);
        l1.put('E',9);
        l1.put('I',8);
        l1.put('O',7);
        l1.put('U',6);
        l1.put('a',5);
        l1.put('e',4);
        l1.put('i',3);
        l1.put('o',2);
        l1.put('u',1);
        List<Character> s1=new ArrayList<>();
        Map<Integer,Character> l2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(l1.containsKey(c))
            {
                l2.put(i,c);
                s1.add(c);
            }
        }
        s1.sort((a,b)->l1.get(b)-l1.get(a));
        List<Integer> change=new ArrayList<>(l2.keySet());
        Collections.sort(change);
        StringBuilder res=new StringBuilder(s);
        for(int i=0;i<change.size();i++)
        {
            res.setCharAt(change.get(i),s1.get(i));
        }
        return res.toString();

        
        
    }
}