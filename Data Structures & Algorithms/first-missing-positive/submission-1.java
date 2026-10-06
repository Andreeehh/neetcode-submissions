class Solution {
    public int firstMissingPositive(int[] nums) {
        int ret = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;i++) {
            int num = nums[i];
            if (num <= 0) {
                continue;
            }
            if (num == ret) {
                if (i+1 == nums.length) {
                    return ret + 1;
                }
                if (nums[i + 1] != num){
                    ret++;
                }
            } else {
                return ret;
            }
        }
        return ret;
    }
}