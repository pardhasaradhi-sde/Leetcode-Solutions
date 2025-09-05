class Solution {
    public void count(int num,int[] cou)
    {
        if(num==0)
        {
            return ;
        }
        if(num%2==0)
        {
            num/=2;
            cou[0]=cou[0]+1;
        }
        else{
            num-=1;
            cou[0]=cou[0]+1;
        }
        count(num,cou);
    }
    public int numberOfSteps(int num) {
        int cou[]=new int[1];
       count(num,cou);
       return cou[0];
    }
}