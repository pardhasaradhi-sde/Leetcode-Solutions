class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
        {
            return false;
        }
        int peak=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                continue;
            }
            else if(arr[i]==arr[i-1])
            {
                return false;
            }
            else if(arr[i]<arr[i-1])
            {
                peak=i-1;
                break;
            }
        }
        if(peak<=0 || peak==arr.length-1)
        {
            return false;
        }
        for(int i=peak+1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}