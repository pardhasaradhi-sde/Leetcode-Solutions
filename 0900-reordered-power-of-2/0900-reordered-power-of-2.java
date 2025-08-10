class Solution {
    private int[] countdigits(int n)
    {
        int num=n;
        int count[]=new int[10];
        while(num>0)
        {
            count[num%10]++;
            num=num/10;
        }   
        return count;
    }
    public boolean reorderedPowerOf2(int n) {
        int target[]=countdigits(n);
        for(int i=0;i<31;i++)
        {
            if(Arrays.equals(target,countdigits(1<<i)))
            {
                return true;
            }
        }
        return false;
    }
}