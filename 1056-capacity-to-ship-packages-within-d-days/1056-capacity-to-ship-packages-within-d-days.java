class Solution {

    public boolean canShipWithinDays(int[] weights, int capacity, int maxDays) {
        int daysNeeded = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return daysNeeded <= maxDays;
    }

    public int shipWithinDays(int[] weights, int maxDays) {
        int minCapacity = Integer.MIN_VALUE;
        int maxCapacity = 0;

        for (int weight : weights) {
            minCapacity = Math.max(minCapacity, weight);
            maxCapacity += weight;
        }

        int bestCapacity = maxCapacity;

        while (minCapacity <= maxCapacity) {
            int midCapacity = minCapacity + (maxCapacity - minCapacity) / 2;

            if (canShipWithinDays(weights, midCapacity, maxDays)) {
                bestCapacity = midCapacity;
                maxCapacity = midCapacity - 1;
            } else {
                minCapacity = midCapacity + 1;
            }
        }

        return bestCapacity;
    }
}
