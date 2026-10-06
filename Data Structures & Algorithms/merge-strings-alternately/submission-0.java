class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        StringBuilder ret = new StringBuilder();
        String substring = "";
        int limit = 0;
        if (len1==len2) {
            limit = len1;
        } else if (len1>len2) {
            limit = len2;
            substring = word1.substring(len2, len1);
        } else {
            limit = len1;
            substring = word2.substring(len1, len2);
        }
        ret.append(merge(word1,word2,limit)).append(substring);
        return ret.toString();
    }

    private String merge(String w1, String w2, int limit) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            ret.append(w1.charAt(i));
            ret.append(w2.charAt(i));
        }
        return ret.toString();
    }
}