class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i]; 
            cars[i][1] = i; 
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0]));
        Deque<Double> deque = new ArrayDeque<>();
        for (int i = cars.length - 1; i >= 0; i--) {
            double coefficient = (target - cars[i][0]) / (double) speed[cars[i][1]];
            if (deque.isEmpty()) {
                deque.addLast(coefficient);
                continue;
            }
            if (deque.peekLast() < coefficient) {
                deque.addLast(coefficient);
            }
        }
        return deque.size();
    }
}
