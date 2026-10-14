class FreqStack {
    HashMap<Integer, Integer> freq = new HashMap<>();
    HashMap<Integer, Deque<Integer>> group = new HashMap<>();
    int maxFreq = 0;

    public FreqStack() {}

    public void push(int val) {
        int currentFreq = freq.getOrDefault(val, 0) + 1;
        freq.put(val, currentFreq);
        Deque<Integer> currentDeque = group.getOrDefault(currentFreq, new ArrayDeque<>());
        currentDeque.addLast(val);
        group.put(currentFreq, currentDeque);
        maxFreq = Math.max(maxFreq, currentFreq);
    }

    public int pop() {
        Deque<Integer> maxDeque = group.get(maxFreq);

        int val = maxDeque.removeLast();
        freq.put(val, freq.get(val) - 1);

        if (maxDeque.isEmpty()) {
            maxFreq--;
        }

        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */