class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int prodWithoutZero = 1;
        int countZeros = 0;
        for (int num : nums) {
            prod *= num;
            if (num != 0) {
                prodWithoutZero *= num;
            } else {
                countZeros++;
            }
        }
        
        int[] ret = new int[nums.length];
        if (countZeros > 1) {
            return ret;
        }
        for (int i=0; i < nums.length;i++) {
            if (nums[i] == 0) {
                ret[i] = prodWithoutZero;
                continue;
            }
            ret[i] = prod / nums[i];
        }
        return ret;
    }
}  
