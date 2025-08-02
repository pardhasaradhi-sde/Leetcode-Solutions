class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum=0;
        int mod=1000000007;
        int nextsmaller[]=new int[arr.length];
        int prevsmaller[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]>arr[i])
            {
                s.pop();
            }
            prevsmaller[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            nextsmaller[i]=s.isEmpty()?arr.length:s.peek();
            s.push(i);
        }   
        for(int i=0;i<arr.length;i++)
        {
            long left=i-prevsmaller[i];
            long right=nextsmaller[i]-i;
            sum+=arr[i]*left*right;
            sum%=mod;
        }
        return (int)sum;
    }
}