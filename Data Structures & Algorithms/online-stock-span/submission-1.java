class StockSpanner {

    Deque<int[]> deque;

    public StockSpanner() {
        this.deque = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!this.deque.isEmpty() && this.deque.peekFirst()[0] <= price) {
            span+= this.deque.removeFirst()[1];
        }
        this.deque.addFirst(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */