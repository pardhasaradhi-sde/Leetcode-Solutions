class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       List<int[]> l1=new ArrayList<>();
       l1.add(new int[]{intervals[0][0],intervals[0][1]});
       for(int i=0;i<intervals.length;i++)
       {
        int[] last=l1.get(l1.size()-1);
        int curr[]=intervals[i];
        if(last[1]>=curr[0])
        {
            last[1]=Math.max(last[1],curr[1]);
        }else{
            l1.add(new int[]{curr[0],curr[1]});
        }
       }
       return l1.toArray(new int[l1.size()][]);
    }
}