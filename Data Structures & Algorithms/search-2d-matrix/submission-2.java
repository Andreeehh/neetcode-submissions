class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix[0].length - 1;
        int bottom = 0, top = matrix.length - 1;
        int midHorizontal = left + (right - left) / 2;
        int midVertical = bottom + (top - bottom) / 2;
        while (bottom <= top) {
            midVertical = bottom + (top - bottom) / 2;
            if (matrix[midVertical][left] <= target && matrix[midVertical][right] >= target) {
                break;
            }
            if (matrix[midVertical][left] < target) {
                bottom = midVertical + 1;
            } else {
                top = midVertical - 1;
            }
        }
        if (bottom > top) {
            return false;
        }
        while (left <= right) {
            midHorizontal = left + (right - left) / 2;
            if (matrix[midVertical][midHorizontal] == target) {
                return true;
            }
            if (matrix[midVertical][midHorizontal] > target) {
                right = midHorizontal - 1;
            } else {
                left = midHorizontal + 1;
            }
        }
        return false;
    }
}
