class Solution {
    public String sortVowels(String s) {
        Map<Character,Integer> weight=new HashMap<>();
        weight.put('A',10);
        weight.put('E',9);
        weight.put('I',8);
        weight.put('O',7);
        weight.put('U',6);
        weight.put('a',5);
        weight.put('e',4);
        weight.put('i',3);
        weight.put('o',2);
        weight.put('u',1);
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->weight.get(b)-weight.get(a));
        Map<Integer,Character> vowelmap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(weight.containsKey(c))
            {
                vowelmap.put(i,c);
                pq.offer(c);
            }
        }
        if(vowelmap.isEmpty())
        {
            return s;
        }
        StringBuilder res=new StringBuilder(s);
        List<Integer> indices=new ArrayList<>(vowelmap.keySet());
        Collections.sort(indices);
        for(int i=0;i<indices.size();i++)
        {
            res.setCharAt(indices.get(i),pq.poll());
        }
        return res.toString();  
    }
}