class MyQueue {

    Deque<Integer> deque;

    public MyQueue() {
        this.deque = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.deque.addLast(x);
    }
    
    public int pop() {
        return deque.removeFirst();
    }
    
    public int peek() {
        return deque.peekFirst();
    }
    
    public boolean empty() {
        return deque.isEmpty();
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