class MinStack {
    Stack<Integer> s;
    Stack <Integer> mini;
    int m;
    public MinStack() {
        s=new Stack<>();
        mini=new Stack<>();
        m=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val<=m)
        {
            mini.push(m);
            m=val;
        }
        s.push(val);
    }
    
    public void pop() {
       int temp=s.pop();
       if(temp==m)
       {
        m=mini.pop();
       }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m;
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