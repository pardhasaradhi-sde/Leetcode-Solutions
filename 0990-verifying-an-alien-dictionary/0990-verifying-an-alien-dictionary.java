class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> m1=new HashMap<>();
        int f=0;
        for(char word:order.toCharArray())
        {
                m1.put(word,f++);
        }
        for(int i=0;i<words.length-1;i++)
        {
            String w1=words[i],w2=words[i+1];
            for(int j=0;j<w1.length();j++)
            {
                if(j>=w2.length())
                {
                    return false;
                }
                else if(w1.charAt(j)!=w2.charAt(j))
                {
                    if(m1.get(w1.charAt(j))>m1.get(w2.charAt(j)))
                    {
                        return false;
                    }
                    else{
                        break;
                    }
                }
                
            }
        }
        return true;
    }
}