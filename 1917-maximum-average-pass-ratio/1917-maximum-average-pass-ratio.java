class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double maxavg=0.0;
        int n=classes.length;
        PriorityQueue<int[]> p1=new PriorityQueue<>((a,b)->
        {
            double gainA=(double)(a[0]+1)/(a[1]+1)-(double)(a[0])/(a[1]);
            double gainB=(double)(b[0]+1)/(b[1]+1)-(double)(b[0])/(b[1]);
            return Double.compare(gainB,gainA);
        });
        for(int[] arr:classes)
        {
            p1.offer(arr);
        }
        while(extraStudents>0)
        {
            int[] top=p1.poll();
            top[0]++;
            top[1]++;
            p1.offer(top);
            extraStudents--;
        }
        for(int[] arr:p1)
        {
            maxavg+=(double)arr[0]/arr[1];
        }
        return maxavg/n;
    }
}