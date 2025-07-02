class Solution {
    public int findJudge(int n, int[][] trust) {
    if(trust.length==0 && n<=1)
    {
        return 1;
    }
    HashMap<Integer,Integer> h1=new HashMap<>();
    for(int j=0;j<trust.length;j++)
    {
        int trusted=trust[j][1];
        h1.put(trusted,h1.getOrDefault(trusted,0)+1);
    }
    int judge=-1;
    for(Map.Entry<Integer,Integer> entry :   h1.entrySet())
    {
        if(entry.getValue()==n-1)
        {
            judge=entry.getKey();
            break;
        }
    }
    for(int i=0;i<trust.length;i++)
    {
        if(trust[i][0]==judge)
        {
            return -1;
        }
    }
    return judge;
    }
}