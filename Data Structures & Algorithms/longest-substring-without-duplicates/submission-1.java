class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndex = new HashMap<>();
        int maxSeq = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (charIndex.containsKey(c)) {
                left = Math.max(left, charIndex.get(c) + 1);
            }

            charIndex.put(c, right);

            maxSeq = Math.max(maxSeq, right - left + 1);
        }

        return maxSeq;
    }
}
