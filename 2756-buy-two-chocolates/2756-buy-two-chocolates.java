class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]+prices[i+1]>money)
            {
                continue;
            }
            else{
                money-=prices[i];
                money-=prices[i+1];
                break;
            }
        }
        return money;
    }
}