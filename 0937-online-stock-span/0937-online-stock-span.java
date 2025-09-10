class StockSpanner {
    ArrayList<Integer> s;
    public StockSpanner() {
        s=new ArrayList<>();
    }
    public int next(int price) {
        int span=1;
        if(s!=null)
        {
        for(int i=s.size()-1;i>=0;i--)
        {
            if(price>=s.get(i))
            {
                span=span+1;
            }
            else{
                break;
            }
        }
        }
        s.add(price);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */