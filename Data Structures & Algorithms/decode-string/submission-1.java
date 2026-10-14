class Solution {
    public String decodeString(String s) {
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                i = appendSequence(ret, s, i);
            } else {
                ret.append(c);
                i++;
            }
        }
        return ret.toString();
    }

    private int appendSequence(StringBuilder ret, String s, int i) {
        StringBuilder sequence = new StringBuilder();
        int times = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            times = times * 10 + (s.charAt(i) - '0');
            i++;
        }

        i++;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ']') {
                i++;
                break;
            }
            if (Character.isDigit(c)) {
                i = appendSequence(sequence, s, i);
            } else {
                sequence.append(c);
                i++;
            }
        }
        for (int t = 0; t < times; t++) {
            ret.append(sequence);
        }
        return i;
    }
}