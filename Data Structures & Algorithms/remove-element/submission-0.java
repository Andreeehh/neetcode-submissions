class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        while (j < nums.length) {
            int read = nums[j];
            if (read != val) {
                nums[i] = read;
                i++;
            }
            j++;
        }
        return i;
    }
}