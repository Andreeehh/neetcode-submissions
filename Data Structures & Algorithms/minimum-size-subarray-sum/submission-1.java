class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ret = Integer.MAX_VALUE, left = 0, sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                ret = Math.min(ret, right - left + 1);
                sum -= nums[left++];
            }
        }
        return ret != Integer.MAX_VALUE ? ret : 0;
    }
}