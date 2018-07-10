class MinStack {
     Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();


    /** initialize your data structure here. */
    public MinStack() {
        
       
    }
    
    public void push(int x) {
        st1.push(x);
        if(st2.isEmpty() || st2.peek() >= x){
            st2.push(x);
        }
    }
    
    public void pop() {
        if(st2.peek() == st1.pop()){
            st2.pop();
        }
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */