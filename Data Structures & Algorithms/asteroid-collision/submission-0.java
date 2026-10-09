class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && asteroid < 0 && !deque.isEmpty() && deque.peekLast() > 0) {
                int top = deque.peekLast();

                if (top < Math.abs(asteroid)) {
                    deque.removeLast();
                } else if (top == Math.abs(asteroid)) {
                    deque.removeLast();
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if (alive) {
                deque.addLast(asteroid);
            }
        }
        int[] result = new int[deque.size()];
        int i = 0;

        for (int asteroid : deque) {
            result[i++] = asteroid;
        }

        return result;
    }
}