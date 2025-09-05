class Solution {
    public int count(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num%2==0)
        {
            return 1+count(num/2);
        }
        else{
            num-=1;
            return 1+count(num);
        }
    }
    public int numberOfSteps(int num) {
        return count(num); 
    }
}