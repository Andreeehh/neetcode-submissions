class Solution {
    public int characterReplacement(String s, int k) {

        int[] charAmount = new int[26];

        int left = 0;
        int maxCharAmount = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            charAmount[c - 'A']++;

            maxCharAmount = Math.max(
                maxCharAmount,
                charAmount[c - 'A']
            );

            int windowSize = right - left + 1;
            int operations = windowSize - maxCharAmount;

            if (operations > k) {
                charAmount[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(
                longest,
                right - left + 1
            );
        }

        return longest;
    }
}
