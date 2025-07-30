class MyQueue {
    Stack<Integer> s;
    Stack<Integer> temp;
    public MyQueue() {
        s=new Stack<>();
        temp=new Stack<>();
    }
    
    public void push(int x) {
       s.push(x);
    }
    
    public int pop() {
        if(!temp.isEmpty())
        {
            return temp.pop();
        }
        else{
            while(!s.isEmpty())
            {
                temp.push(s.pop());
            }
        }
       return  temp.isEmpty()?-1:temp.pop();
    }
    
    public int peek() {
        if(!temp.isEmpty())
        {
            return temp.peek();
        }
        else{
            while(!s.isEmpty())
            {
                temp.add(s.pop());
            }
        }
        return temp.isEmpty()?-1:temp.peek();
    }
    
    public boolean empty() {
        return s.isEmpty() && temp.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */