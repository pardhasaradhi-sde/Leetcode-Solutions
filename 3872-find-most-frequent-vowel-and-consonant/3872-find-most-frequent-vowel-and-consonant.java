class Solution {
    public boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowels=new HashMap<>();
        Map<Character,Integer> consonants=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(isVowel(c))
            {
                vowels.put(c,vowels.getOrDefault(c,0)+1);
            }
            else{
                consonants.put(c,consonants.getOrDefault(c,0)+1);
            }
        }
        int maxvow=0;
        int maxcon=0;
        for(int c:vowels.values())
        {
            if(c>maxvow)
            {
                maxvow=c;
            }
        }
        for(int c:consonants.values())
        {
            if(c>maxcon)
            {
                maxcon=c;
            }
        }
        return maxcon+maxvow;
    }
}