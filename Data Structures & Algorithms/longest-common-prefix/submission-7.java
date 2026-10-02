class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int limit = Math.min(ret.length(), strs[i].length());

            for (int j = 0; j < limit; j++) {
                if (ret.charAt(j) != strs[i].charAt(j)) {
                    ret = ret.substring(0, j);
                    break;
                }
            }

            if (strs[i].length() < ret.length()) {
                ret = ret.substring(0, strs[i].length());
            }

            if (ret.length() == 0) {
                return "";
            }
        }

        return ret;
    }
}