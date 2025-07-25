class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(char c:t.toCharArray())
        {
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> windowmap=new HashMap<>();   
        int left=0;
        int right=0;
        int formed=0;
        int required=tmap.size();
        int minlen=Integer.MAX_VALUE;
        int start   =0;  
        while(right<s.length())
        {
            char c=s.charAt(right);
            windowmap.put(c,windowmap.getOrDefault(c,0)+1);
            if(tmap.containsKey(c) && tmap.get(c).intValue()==windowmap.get(c).intValue())
            {
                formed++;
            }
            while(formed==required)
            {
                if(minlen>(right-left+1))
                {
                    minlen=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                windowmap.put(leftchar,windowmap.getOrDefault(leftchar,0)-1);
                if(tmap.containsKey(leftchar) && windowmap.get(leftchar).intValue()<tmap.get(leftchar).intValue())
                {
                    formed--;
                }
                left++;

            }

            right++;

        }
        return (minlen==Integer.MAX_VALUE)? "" :s.substring(start,start+minlen);
    }
}