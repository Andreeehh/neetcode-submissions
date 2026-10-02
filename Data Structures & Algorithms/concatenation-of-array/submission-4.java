class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ret = new int[len*2];
        for (int i = 0; i < len; i++) {
            ret[i] = nums[i];
            ret[i+len] = nums[i];
        }
        return ret;
    }
}