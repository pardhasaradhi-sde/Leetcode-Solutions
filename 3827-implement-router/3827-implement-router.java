import java.util.*;

class Router {
    int memoryLimit;
    Queue<String> q;
    Map<String, int[]> packets;
    Map<Integer, List<Integer>> dest;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.q = new LinkedList<>();
        this.packets = new HashMap<>();
        this.dest = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "#" + destination + "#" + timestamp;
        if (packets.containsKey(key)) return false;

        if (q.size() >= memoryLimit) forwardPacket();

        packets.put(key, new int[]{source, destination, timestamp});
        q.offer(key);

        dest.computeIfAbsent(destination, k -> new ArrayList<>()).add(timestamp);
        return true;
    }

    public int[] forwardPacket() {
        if (q.isEmpty()) return new int[]{};

        String key = q.poll();
        int[] arr = packets.remove(key);

        // remove the oldest timestamp from the destination list
        List<Integer> tsList = dest.get(arr[1]);
        tsList.remove(0); // FIFO

        return arr;
    }

    public int getCount(int destination, int startTime, int endTime) {
        List<Integer> tsList = dest.getOrDefault(destination, new ArrayList<>());
        return upperBound(tsList, endTime) - lowerBound(tsList, startTime);
    }

    private int lowerBound(List<Integer> arr, int target) {
        int left = 0, right = arr.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    private int upperBound(List<Integer> arr, int target) {
        int left = 0, right = arr.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) > target) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
