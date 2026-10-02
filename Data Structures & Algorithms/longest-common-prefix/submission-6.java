class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = strs[0];
        int longestPrefix = ret.length();

        for (int i = 1; i < strs.length; i++) {

            int limit = Math.min(longestPrefix, strs[i].length());

            for (int j = 0; j < limit; j++) {
                if (ret.charAt(j) != strs[i].charAt(j)) {
                    ret = ret.substring(0, j);
                    longestPrefix = j;
                    break;
                }
            }

            if (strs[i].length() < longestPrefix) {
                ret = ret.substring(0, strs[i].length());
                longestPrefix = strs[i].length();
            }

            if (ret.length() == 0) {
                return "";
            }
        }

        return ret;
    }
}