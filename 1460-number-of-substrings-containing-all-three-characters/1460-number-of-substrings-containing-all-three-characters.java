class Solution {
    public int numberOfSubstrings(String s) {
        int left=0;
        int right=0;
        int count=0;
        Map<Character,Integer> l1=new HashMap<>();
        while(right<s.length())
        {
            l1.put(s.charAt(right),l1.getOrDefault(s.charAt(right),0)+1);
            while(l1.getOrDefault('a',0)>=1 && l1.getOrDefault('b',0)>=1 && l1.getOrDefault('c',0)>=1)
            {
                count+=s.length()-right;
                l1.put(s.charAt(left),l1.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            right++;
        }
        return count;
    }
}