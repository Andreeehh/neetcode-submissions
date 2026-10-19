class Solution {
    public int mySqrt(int x) {
        int left = 0, right = x, ret = 0;
        long mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                ret = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return ret;
    }
}