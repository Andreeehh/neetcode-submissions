class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        int colums = matrix[0].length;
        int mid = left + (right - left) / 2;
        int row = mid / colums;
        int col = mid % colums;
        while (left <= right) {
            mid = left + (right - left) / 2;
            row = mid / colums;
            col = mid % colums;
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
