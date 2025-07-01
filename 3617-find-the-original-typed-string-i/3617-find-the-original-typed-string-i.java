class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        for(int i=0;i<word.length()-1;i++)
        {
            char c=word.charAt(i);
            if(c==word.charAt(i+1))
            {
                count++;
            }
        }
        return count;
    }
}