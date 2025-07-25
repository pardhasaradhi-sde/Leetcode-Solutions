class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced=0;
        boolean isplaced[]=new boolean[baskets.length];  
        for(int i=0;i<fruits.length;i++)
        {
            boolean placed=false;
            for(int j=0;j<baskets.length;j++)
            {
                if(!isplaced[j] && fruits[i]<=baskets[j])
                {
                   isplaced[j]=true;
                   placed=true;
                    break;

                }
            }
            if(!placed)
            {
                unplaced++;
            }
        }
        return unplaced;

    }
}