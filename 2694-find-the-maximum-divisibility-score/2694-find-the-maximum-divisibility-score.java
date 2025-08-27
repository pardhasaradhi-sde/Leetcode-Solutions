class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxscore=-1;
        int bestdiv=Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++)
        {
            int score=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%divisors[i]==0)
                {
                    score++;
                }
            }
            if(score>maxscore || score==maxscore && divisors[i]<bestdiv)
            {
                maxscore=score;
                bestdiv=divisors[i];
            }
        }
        return bestdiv;
    }
}