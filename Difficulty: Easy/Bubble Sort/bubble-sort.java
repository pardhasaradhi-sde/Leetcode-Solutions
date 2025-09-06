class Solution {
    public void bs(int[] arr,int end,int start)
    {
        if(end<0)
        {
            return;
        }
        if(start!=end)
        {
            if(arr[start]>arr[start+1])
            {
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            bs(arr,end,start+1);
        }
        else{
            bs(arr,end-1,0);
        }
    }
    public void bubbleSort(int[] arr) {
        bs(arr,arr.length-1,0);
        
    }
}