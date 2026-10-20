class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxValue = 0;
        int sumValue = 0;

        for (int weight : weights) {
            maxValue = Math.max(maxValue, weight);
            sumValue += weight;
        }
        int minCap = Integer.MAX_VALUE;
        int left = maxValue;
        int right = sumValue;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midCap = calcCap(weights, mid);
            if (midCap <= days) {
                minCap = Math.min(minCap, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minCap;
    }

    private int calcCap(int[] weights, int cap) {
        int sum = 0;
        int ret = 0;
        for (int weight : weights) {
            sum += weight;
            if (sum > cap) {
                ret++;
                sum = weight;
            }
        }
        return ret + 1;
    }
}