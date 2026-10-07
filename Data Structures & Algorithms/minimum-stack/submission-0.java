class MinStack {
    private Deque<Integer> minStack;
    private Deque<Integer> stack;

    public MinStack() {
        minStack = new ArrayDeque<>();
        stack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.addFirst(val);

        if (minStack.isEmpty()) {
            minStack.addFirst(val);
        } else {
            minStack.addFirst(Math.min(val, minStack.peekFirst()));
        }
    }

    public void pop() {
        stack.removeFirst();
        minStack.removeFirst();
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        return minStack.peekFirst();
    }
}
