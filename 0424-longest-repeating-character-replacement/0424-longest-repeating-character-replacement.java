class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxlen=0;
        int maxfreq=0;
        int freq[]=new int[26];
        while(right<s.length())
        {
            char c=s.charAt(right);
            freq[c-'A']++;
            maxfreq=Math.max(maxfreq,freq[c-'A']);
            if(((right-left+1)-maxfreq)>k)
            {
                freq[s.charAt(left)-'A']--;
                maxfreq=0;
                for(int i=0;i<25;i++)
                {
                    maxfreq=Math.max(maxfreq,freq[i]);
                }
                left++;
            }
            if(((right-left+1)-maxfreq)<=k)
            {
                maxlen=Math.max(right-left+1,maxlen);
            }
            right++;
        }
        return maxlen;
    }

}