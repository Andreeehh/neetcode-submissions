class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ret = new StringBuilder();

        int limit = Math.min(word1.length(), word2.length());

        for (int i = 0; i < limit; i++) {
            ret.append(word1.charAt(i));
            ret.append(word2.charAt(i));
        }

        if (word1.length() > limit) {
            ret.append(word1.substring(limit));
        } else if (word2.length() > limit) {
            ret.append(word2.substring(limit));
        }

        return ret.toString();
    }
}