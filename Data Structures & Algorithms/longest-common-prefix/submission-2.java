class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = strs[0];
        int longestPrefix = ret.length();
        int currentPrefix = 0;
        for (int i = 1; i<strs.length; i++) {
            currentPrefix = 0;
            int limit = Math.min(longestPrefix, strs[i].length());
            for (int j = 0; j < limit; j++) {
                if(ret.charAt(j)!= strs[i].charAt(j)) {
                    break;
                }
                currentPrefix++;
            }
            if (currentPrefix == 0) {
                return "";
            }
            if (currentPrefix < longestPrefix) {
                longestPrefix = currentPrefix;
                ret = ret.substring(0, longestPrefix );
            }
        }
        return ret;
    }
}