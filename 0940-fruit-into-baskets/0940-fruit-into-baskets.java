class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> l1=new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<fruits.length)
        {
           l1.put(fruits[right],l1.getOrDefault(fruits[right],0)+1);
           if(l1.size()>2)
           {
            l1.put(fruits[left],l1.getOrDefault(fruits[left],0)-1);
            if(l1.get(fruits[left])==0)
            {
                l1.remove(fruits[left]);
            }
            left++;
           }
           maxlen=Math.max(maxlen,right-left+1);
           right++;
        }
       return maxlen;
        
    }
}