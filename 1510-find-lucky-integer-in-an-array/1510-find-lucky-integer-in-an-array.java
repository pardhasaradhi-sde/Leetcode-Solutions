class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        int largest=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:h1.entrySet())
        {
            int key=entry.getKey();
            int value=entry.getValue();
            if(value==key && value>largest)
            {
                largest=value;
            }

        }
        return (largest!=Integer.MIN_VALUE)?largest:-1;
    }
}