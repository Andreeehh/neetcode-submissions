class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, right = 0, sum = 0;
        for (int left = 0; left < nums.length; left++) {
            sum = 0;
            for (right = left; right < nums.length; right++) {
                sum += nums[right];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}