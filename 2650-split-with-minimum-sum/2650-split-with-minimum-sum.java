class Solution {
    public int splitNum(int num) {
        List<Integer> l1=new ArrayList<>();
        while(num>0)
        {
            int rem=num%10;
            l1.add(rem);
            num/=10;
        }
        Collections.sort(l1);
        int num1=0;
        int num2=0;
        boolean number=true;
        int left=0;
        while(left<l1.size())
        {
            if(number)
            {
                num1=num1*10+l1.get(left);
                number=false;
            }
            else{
                num2=num2*10+l1.get(left);
                number=true;
            }
            left++;
        }
        return num1+num2;
    }
}