class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            s.add(arr[i]);
        }
        int i=1,count=0;
        while(true)
        {
            if(!s.contains(i))
            {
                count++;
            }
            if(count==k)
            {
                return i;
            }
            i++;
        }

    }
}