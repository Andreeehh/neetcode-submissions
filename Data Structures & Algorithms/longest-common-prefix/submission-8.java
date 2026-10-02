class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int limit = Math.min(ret.length(), strs[i].length());

            int j = 0;

            while (j < limit && ret.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            ret = ret.substring(0, j);

            if (ret.length() == 0) {
                return "";
            }
        }

        return ret;
    }
}