class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] retNums = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int count = 0;

        while (i <= mid && j <= right) {
            int numsLeft = nums[i];
            int numsRight = nums[j];

            if (numsLeft <= numsRight) {
                retNums[count] = numsLeft;
                i++;
            } else {
                retNums[count] = numsRight;
                j++;
            }

            count++;
        }

        while (i <= mid) {
            retNums[count] = nums[i];
            i++;
            count++;
        }

        while (j <= right) {
            retNums[count] = nums[j];
            j++;
            count++;
        }

        for (int k = 0; k < retNums.length; k++) {
            nums[left + k] = retNums[k];
        }
    }
}