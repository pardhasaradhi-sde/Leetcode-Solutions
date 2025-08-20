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
        List<Character> vowels=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(weight.containsKey(c))
            {
                vowels.add(c);
            }
        }
        if(vowels.isEmpty())
        {
            return s;
        }
        vowels.sort((a,b)->weight.get(b)-weight.get(a));
        StringBuilder res=new StringBuilder(s);
        int vowelindex=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(weight.containsKey(c))
            {
                res.setCharAt(i,vowels.get(vowelindex++));
            }
        }
        return res.toString();  
    }
}