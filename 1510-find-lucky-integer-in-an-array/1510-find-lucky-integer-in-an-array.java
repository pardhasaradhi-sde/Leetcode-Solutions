class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(h1.get(arr[i])==arr[i] && h1.get(arr[i])>largest )
            {
                largest=arr[i];
            }
        }
        return (largest!=Integer.MIN_VALUE)?largest:-1;
    }
}