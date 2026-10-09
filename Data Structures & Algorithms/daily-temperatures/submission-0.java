class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while(!deque.isEmpty() && temperatures[deque.peekFirst()] <= temperatures[i]) {
                deque.removeFirst();
            }
            if (!deque.isEmpty()) {
                result[i] = deque.peekFirst() - i;
            }
            deque.addFirst(i);
        }

        return result;
    }
}
