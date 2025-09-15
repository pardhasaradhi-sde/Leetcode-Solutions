class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[]=text.split(" ");
        Set<Character> s=new HashSet<>();
        for(char c:brokenLetters.toCharArray())
        {
            s.add(c);
        }
        int count=0;
        for(String st:words)
        {
            boolean yes=false;
            for(char c:st.toCharArray())
            {
                if(s.contains(c))
                {
                    yes=true;
                }
            }
            if(!yes)
            {
                count=count+1;
            }
        }
        return count;
    }
}