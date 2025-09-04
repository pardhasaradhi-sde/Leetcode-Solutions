class Solution {
    public int findClosest(int x, int y, int z) {
        int p1=0;
        int p2=0;
        while(x!=z)
        {
            if(x>z)
            {
                x--;
                p1++;
            }
            else{
                x++;
                p1++;
            }
        }
        while(y!=z)
        {
            if(y>z)
            {
                y--;
                p2++;
            }
            else{
                y++;
                p2++;
            }
        }
        if(p1>p2)
        {
            return 2;
        }
        else if(p1==p2)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
}