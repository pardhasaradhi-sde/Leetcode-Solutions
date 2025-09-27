class Solution {
    public int buyChoco(int[] prices, int money) {
        int chocolate1=Integer.MAX_VALUE;
        int chocolate2=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            int val=prices[i];
            if(val<chocolate1)
            {
                chocolate2=chocolate1;
                chocolate1=val;
            }
            else if(val<chocolate2){
                chocolate2=val;
            }
        }
        int cost=money-(chocolate1+chocolate2);
        return cost>=0?cost:money;
    }
}