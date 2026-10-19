class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int left = 0;
        int right = nums1.length;
        int leftSize = (nums1.length + nums2.length + 1) / 2;

        while (left <= right) {
            int i = left + (right - left) / 2;
            int j = leftSize - i;

            int left1 = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
            int right1 = i == nums1.length ? Integer.MAX_VALUE : nums1[i];

            int left2 = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
            int right2 = j == nums2.length ? Integer.MAX_VALUE : nums2[j];

            if (left1 <= right2 && left2 <= right1) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return (double) (Math.max(left1, left2) + Math.min(right1, right2)) / 2;
                } else {
                    return (double) Math.max(left1, left2);
                }
            }
            if (left1 > right2) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }
        return 0.0;
    }
}
