class Solution {
    public int findJudge(int n, int[][] trust) {
    int trusted[]=new int[n+1];
    int trustedby[]=new int[n+1];
    for(int []i:trust)
    {
        int a=i[0];
        int b=i[1];
        trusted[a]++;
        trustedby[b]++;
    }
    for(int i=1;i<=n;i++)
    {
        if(trustedby[i]==n-1 && trusted[i]==0)
        {
            return i;
        }
    }
    return -1;
    }
}