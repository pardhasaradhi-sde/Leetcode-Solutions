class Solution {
    public int maxEvents(int[][] events) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(); 
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        int count=0,i=0,n=events.length,day=0;
        while(i<n || !pq.isEmpty() )
        {
            if(pq.isEmpty())
            {
                day=events[i][0];
            }
            while(i<n && events[i][0]==day)
            {
                pq.offer(events[i][1]);
                i++;
            }
            while(!pq.isEmpty() && pq.peek()<day)
            {
                pq.poll();  
            }
            if(!pq.isEmpty())
            {
                pq.poll();
                count++;
            }
            day++;
        }
        return count;
    }
}