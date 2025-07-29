class MyStack {
Stack<Integer> s;
    public MyStack() {
        s=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
         return s.pop();
    }
    
    public int top() {
        int val=s.peek();
        return val;
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */