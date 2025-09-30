class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
       int n=val.length;
       Double[] ratio=new Double[n];
       Integer[] idx=new Integer[n];
       for(int i=0;i<n;i++)
       {
           ratio[i]=(double)val[i]/wt[i];
           idx[i]=i;
       }
       Arrays.sort(idx,(a,b)->Double.compare(ratio[b],ratio[a]));
       double score=0.0;
       for(int i=0;i<n;i++)
       {
           int j=idx[i];
           if(wt[j]<=capacity)
           {
               score+=val[j];
               capacity-=wt[j];
           }
           else{
               double fraction=(double)capacity/wt[j];
               score+=val[j]*fraction;
               break;
           }
       }
       return score;
    }
}