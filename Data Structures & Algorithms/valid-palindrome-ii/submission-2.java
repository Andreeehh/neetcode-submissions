class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        boolean isDeleted = false;
        while (left < right) {
            char leftC = s.charAt(left);
            char rightC = s.charAt(right);
            if (leftC == rightC) {
                left++;
                right--;
                continue;
            }
            if (isDeleted) {
                return false;
            }
            isDeleted = true;
            if (leftC == s.charAt(right - 1) && rightC == s.charAt(left + 1)) {
                return directPalindrome(s.substring(left, right))
                    || directPalindrome(s.substring(left + 1, right + 1));
            }
            if (leftC == s.charAt(right - 1)) {
                right--;
            } else if (rightC == s.charAt(left + 1)) {
                left++;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean directPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char leftC = s.charAt(left);
            char rightC = s.charAt(right);
            if (leftC == rightC) {
                left++;
                right--;
                continue;
            }
            return false;
        }
        return true;
    }
}