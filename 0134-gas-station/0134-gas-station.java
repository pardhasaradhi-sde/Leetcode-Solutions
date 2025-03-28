class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum=0;
        int costsum=0;
        for(int i=0;i<gas.length;i++)
        {
            gassum+=gas[i];
            costsum+=cost[i];
        }
        if(gassum<costsum)
        {
            return -1;
        }
            int tank=0;
            int start=0;
            for(int i=0;i<gas.length;i++)
            {
                tank+=gas[i]-cost[i];
                if(tank<0)
                {
                    start=i+1;
                    tank=0;
                }
            }
        return start;
    }
}