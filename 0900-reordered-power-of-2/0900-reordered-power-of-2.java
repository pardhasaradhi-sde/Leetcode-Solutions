class Solution {
    public boolean ispowerof2(int n)
    {
        return (n>0) && ((n&(n-1))==0);
    }
    public boolean generatepermutation(char[] arr,int idx)
    {
        if(idx==arr.length)
        {
            if(arr[0]=='0')
            {
                return false;
            }
            int num=Integer.parseInt(new String(arr));
            return ispowerof2(num);
        }
        for(int i=idx;i<arr.length;i++)
        {
            swap(arr,i,idx);
            if(generatepermutation(arr,idx+1))
            {
                return true;
            }
            swap(arr,i,idx);
        }
        return false;
    }
    public void swap(char arr[],int i,int j)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public boolean reorderedPowerOf2(int n) {
        char []arr=String.valueOf(n).toCharArray();
        return generatepermutation(arr,0);
        
    }
}