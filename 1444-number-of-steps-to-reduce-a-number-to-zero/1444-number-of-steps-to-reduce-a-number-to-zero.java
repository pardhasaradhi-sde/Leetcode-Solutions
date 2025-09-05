class Solution {
    int cou=0;
    public int count(int num,int cou)
    {
        if(num==0)
        {
            return cou;
        }
        if(num%2==0)
        {
            num/=2;
            cou=cou+1;
        }
        else{
            num-=1;
            cou=cou+1;
        }
        return count(num,cou);
    }
    public int numberOfSteps(int num) {
       return count(num,cou);
    }
}