class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=numBottles;
        int empties=numBottles;
        while(empties>=numExchange)
        {
            empties-=numExchange;
            empties++;
            count++;
            numExchange++;
        }
        return count;
    }
}