class MinStack {
    Stack<Pair<Integer,Integer>> s;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        int currentmin=val;
        min=Math.min(currentmin,min);
        s.push(new Pair<>(val,min));
    }
    
    public void pop() {
        s.pop();
        if(s.isEmpty())
        {
            min=Integer.MAX_VALUE;
        }
        else{
            min=s.peek().getValue();
        }
    }
    
    public int top() {
        Pair<Integer,Integer> top=s.peek();
        return top.getKey();
    }
    
    public int getMin() {
        Pair<Integer,Integer> top=s.peek();
        return top.getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */