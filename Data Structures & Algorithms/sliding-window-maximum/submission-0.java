class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0, right = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ret = new int[nums.length - k + 1];
        while (right < nums.length) {
            
            while (!deque.isEmpty() && nums[right] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(right);
            if (deque.peekFirst() < left) {
                deque.removeFirst();
            }
            if (right - left + 1 == k) {
                ret[left] = nums[deque.peekFirst()];
                left++;
            }
            right++;
        }
        return ret;
    }
}
