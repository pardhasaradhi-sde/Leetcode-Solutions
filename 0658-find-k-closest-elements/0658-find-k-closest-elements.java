class Solution {
    public int binarysearch(int [] arr,int k)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l1=new ArrayList<>();
        int index=binarysearch(arr,x);
        int left=index-1;
        int right=index;
        while(k>0)
        {
            if(left<0)
            {
                l1.add(arr[right]);
                right++;
            }
            else if(right>=arr.length)
            {
                l1.add(arr[left]);
                left--;
            }
            else{
                if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                    l1.add(arr[left]);
                    left--;
                } else {
                    l1.add(arr[right]);
                    right++;
                }
            }
            k--;
        }
        Collections.sort(l1);
        return l1;
    }
}