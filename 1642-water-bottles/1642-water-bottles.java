class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        int empties=numBottles;
        while(empties>=numExchange)
        {
            empties-=numExchange;
            count++;
            empties++;
        }
        return count;
    }
}