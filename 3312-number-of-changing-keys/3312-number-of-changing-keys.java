class Solution {
    public int countKeyChanges(String s) {
        int change=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char c=Character.toLowerCase(s.charAt(i+1));
            if(Character.toLowerCase(s.charAt(i))!=c)
            {
                change++;
            }
        }
        return change;
    }
}