class MyQueue {
    Stack<Integer> st;
    Stack<Integer> temp; 
    public MyQueue() {
        st = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    
    public int pop() {
        if(st.isEmpty()) return -1;
        return st.pop();
    }
    
    public int peek() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty(); 
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