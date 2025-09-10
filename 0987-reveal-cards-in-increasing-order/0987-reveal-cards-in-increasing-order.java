class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int res[]=new int[deck.length];
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<deck.length;i++)
        {
            dq.offer(i);
        }
        int i=0;
        while(!dq.isEmpty())
        {
            int idx=dq.poll();
            res[idx]=deck[i++];
            if(!dq.isEmpty())
            {
            int last=dq.poll();
            dq.addLast(last);
            }
        }
        return res;
    }
}