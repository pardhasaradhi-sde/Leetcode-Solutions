
class Solution {
    public static void swap(int arr[],int i,int j)
    {
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }
    public static void zigZag(int[] arr) {
       for(int i=0;i<arr.length-1;i++)
       {
           if((i&1)!=0)
           {
               if(arr[i]<arr[i+1])
               {
                   swap(arr,i,i+1);
               }
           }
           else{
               if(arr[i]>arr[i+1])
               {
                   swap(arr,i,i+1);
               }
           }
       }
    }
}
