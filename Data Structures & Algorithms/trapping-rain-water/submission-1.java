class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, trap = 0, leftMax = 0, rightMax = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax <= height[left]) {
                    leftMax = height[left];
                } else {
                    trap += leftMax - height[left];
                }
                left++;
            } else {
                if (rightMax <= height[right]) {
                    rightMax = height[right];
                } else {
                    trap += rightMax - height[right];
                }
                right--;
            }
        }
        return trap;
    }
}
