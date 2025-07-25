class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<fruits.length;i++)
        {
            boolean isplaced=false;
            for(int j=0;j<baskets.length;j++)
            {
                if(s.contains(j))
                {
                    continue;
                }
                if(fruits[i]<=baskets[j])
                {
                    s.add(j);
                    isplaced=true;
                    break;
                }
            }
            if(!isplaced)
            {
                unplaced++;
            }
        }
        return unplaced;

    }
}