class Solution {
    private Map<Integer,Integer> countdigits(int n)
    {
        int num=n;
        Map<Integer,Integer> l1=new HashMap<>();
        while(num>0)
        {
            int digit=num%10;
            l1.put(digit,l1.getOrDefault(digit,0)+1);
            num=num/10;
        }   
        return l1;
    }
    public boolean reorderedPowerOf2(int n) {
        Map<Integer,Integer> l1=countdigits(n);
        for(int i=0;i<31;i++)
        {
            int power=1<<i;
            if(l1.equals(countdigits(power)))
            {
                return true;
            }
        }
        return false;
    }
}