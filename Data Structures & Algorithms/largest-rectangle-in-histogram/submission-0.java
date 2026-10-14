class Solution {
    public int largestRectangleArea(int[] heights) {
        int left = 0, right = 0, maxArea = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        while (right < heights.length) {
            while (!deque.isEmpty() && heights[right] < heights[deque.peekLast()]) {
                int removeIndex = deque.removeLast();
                int width;

                if (deque.isEmpty()) {
                    width = right;
                } else {
                    width = right - deque.peekLast() - 1;
                }
                int area = heights[removeIndex] * width;
                maxArea = Math.max(area, maxArea);
            }
            deque.addLast(right);
            right++;
        }
        while (!deque.isEmpty()) {
            int removeIndex = deque.removeLast();

            int width;

            if (deque.isEmpty()) {
                width = right;
            } else {
                width = right - deque.peekLast() - 1;
            }
            int area = heights[removeIndex] * width;
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
