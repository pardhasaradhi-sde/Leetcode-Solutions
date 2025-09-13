class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int icecount=0;
        for(int i=0;i<costs.length;i++)
        {
            if(coins>0)
            {
                coins-=costs[i];
                if(coins<0)
                {
                    break;
                }
                icecount++;
            }
        }
        return icecount;
    }
}