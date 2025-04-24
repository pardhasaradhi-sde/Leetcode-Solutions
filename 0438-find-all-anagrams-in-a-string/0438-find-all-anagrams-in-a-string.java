class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        Map<Character,Integer> pmap=new HashMap<>();
        Map<Character,Integer> smap=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        if(s.length()<p.length())
        {
            return l1;
        }
        for(char num:p.toCharArray())
        {
            pmap.put(num,pmap.getOrDefault(num,0)+1);
        }
        int left=0;
        int right=0;
        while(right<s.length())
        {
            char ch=s.charAt(right);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(right-left+1>p.length())
            {
                char leftchar=s.charAt(left);
                smap.put(leftchar,smap.get(leftchar)-1);
                if(smap.get(leftchar)==0)
                {
                    smap.remove(leftchar);
                }
                left++;
            }
            if(right-left+1==p.length() && smap.equals(pmap))
            {
                    l1.add(left);
            }
            right++;
        }
        return l1;
    }
}