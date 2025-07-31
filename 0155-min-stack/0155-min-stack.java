class MinStack {
    Stack<Integer> s;
    Stack <Integer> min1;
    int mini=Integer.MAX_VALUE;
    public MinStack() {
        s=new Stack<>();
        min1=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        mini=Math.min(mini,val);
        min1.push(mini);
    }
    
    public void pop() {
        s.pop();
        min1.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min1.peek();
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