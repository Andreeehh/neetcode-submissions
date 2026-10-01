class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left + ((right-left)/2);
        boolean leftOrdened = false;
        while(left<=right){
            mid = left + ((right-left)/2);
            if (nums[mid] == target) {
                return mid;
            }
            leftOrdened = nums[left] <= nums[mid];
            if (leftOrdened) {
                if (nums[left] <= target && target < nums[mid]){
                    right = mid;
                } else {
                    left = mid +1;
                }    
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid +1;
                } else {
                    right = mid;
                }
            }
        }
        return -1;
    }
}
