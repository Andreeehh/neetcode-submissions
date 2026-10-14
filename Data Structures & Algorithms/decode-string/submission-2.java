class Solution {
    private int index;

    public String decodeString(String s) {
        index = 0;
        return decode(s);
    }

    private String decode(String s) {
        StringBuilder result = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {
            char c = s.charAt(index);

            if (!Character.isDigit(c)) {
                result.append(c);
                index++;
                continue;
            }

            int times = 0;

            while (index < s.length() &&
                   Character.isDigit(s.charAt(index))) {
                times = times * 10 + (s.charAt(index) - '0');
                index++;
            }

            index++; 

            String sequence = decode(s);

            index++;

            for (int i = 0; i < times; i++) {
                result.append(sequence);
            }
        }

        return result.toString();
    }
}