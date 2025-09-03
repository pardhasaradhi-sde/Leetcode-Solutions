class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int arr[]=new int[n];
        int mod=1000000007;
        Arrays.fill(arr,1);
        int i=1;
        while(i<=k)
        {
            for(int h=1;h<arr.length;h++)
            {
                arr[h]=(arr[h]+arr[h-1])%mod;
            }
            i++;
        }
        return (arr[arr.length-1])%mod;
    }
}