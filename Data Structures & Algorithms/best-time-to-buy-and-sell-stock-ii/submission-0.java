class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0, left=0;
        for (int right = 1; right < prices.length; right++) {
            if (prices[left] < prices[right] && prices[right] - prices[left] > profit) {
                profit = prices[right] - prices[left];
            } else {
                maxProfit += profit;
                profit = 0;
                left = right;
            }
        }
        return maxProfit + profit;
    }
}