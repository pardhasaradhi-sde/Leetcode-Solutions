class Solution {
    void ss(int[] arr,int start,int end,int minind)
    {
        if(start==arr.length-1)
        {
            return;
        }
        if(end!=arr.length)
        {
            if(arr[end]<arr[minind])
            {
                minind=end;
            }
            ss(arr,start,end+1,minind);
        }
        else{
            int temp=arr[start];
            arr[start]=arr[minind];
            arr[minind]=temp;
            ss(arr,start+1,start+1,start+1);
        }
    }
    
    void selectionSort(int[] arr) {
        ss(arr,0,0,0);
    }
}