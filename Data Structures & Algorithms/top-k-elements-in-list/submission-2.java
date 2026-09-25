class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );
        int currentNum = nums[0];
        int currentNumFreq = 0;
        for (int num : nums) {
            if (currentNum != num) {
                if (pq.size() < k) {
                    pq.add(new int[]{currentNum, currentNumFreq});
                } else if (currentNumFreq > pq.peek()[1]) {
                    pq.poll();
                    pq.add(new int[]{currentNum, currentNumFreq});
                }
                currentNum = num;
                currentNumFreq = 0;
            }
            currentNumFreq++;
        }
        if (pq.size() < k) {
            pq.add(new int[]{currentNum, currentNumFreq});
        } else if (currentNumFreq > pq.peek()[1]) {
            pq.poll();
            pq.add(new int[]{currentNum, currentNumFreq});
        }
        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll()[0];
        }
        return result;
    }
}