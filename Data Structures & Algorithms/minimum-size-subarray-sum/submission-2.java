class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ret = Integer.MAX_VALUE;
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int left = 0; left < nums.length; left++) {
            int targetPrefix = prefix[left] + target;
            int low = left + 1;
            int high = prefix.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (prefix[mid] >= targetPrefix) {
                    ret = Math.min(ret, mid - left);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return ret != Integer.MAX_VALUE ? ret : 0;
    }
}