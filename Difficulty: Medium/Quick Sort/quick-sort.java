class Solution {
    public void quickSort(int[] arr, int low, int high) {
       if(low<high)
       {
           int partitionind=partition(arr,low,high);
           quickSort(arr,low,partitionind-1);
           quickSort(arr,partitionind+1,high);
       }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(true)
        {
            while(i<=high && arr[i]<=pivot)
            {
                i++;
            }
            while(j>=low && arr[j]>pivot)
            {
                j--;
            }
            if(i>=j)
            {
                break;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
            return j;
    }
}