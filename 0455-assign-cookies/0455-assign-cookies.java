class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int left=0;
        int right=0;
        int count=0;
        while(left<g.length && right<s.length)
        {
            if(g[left]<=s[right])
            {
                count++;
                right++;
                left++;
            }
            else{
            right++;
            }
        }
        return count;
    }
}