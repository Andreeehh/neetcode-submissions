class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }
        int i = 0, j =0, current = 0;
        for (int c : count) {
            j = 0;
            while (j < c) {
                nums[i++] = current;
                j++;
            }
            current++;
        }
    }
}