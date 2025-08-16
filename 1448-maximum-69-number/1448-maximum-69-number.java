class Solution {
    public int maximum69Number (int num) {
        int n=num;
        int index=-1;
        int pos=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem==6)
            {
                index=pos;
            }
            n/=10;
            pos++;
        }
        if(index!=-1)
        {
            num+=3*(int)Math.pow(10,index);
        }
        return num;
    }
}