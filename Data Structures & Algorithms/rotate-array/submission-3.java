class Solution {
    public void rotate(int[] nums, int k) {
        int[] rep = Arrays.copyOf(nums, nums.length);
        if (k > nums.length) {
            k = k%nums.length;
        }
        for(int i = 0; i < nums.length; i++) {
            int index = i - k;

            if (index < 0) {
                index += nums.length;
            }
            nums[i] = rep[index];
        }
    }
}
