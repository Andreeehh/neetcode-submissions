class Solution {
    private int getIndex(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        } else {
            return c - 'a' + 26;
        }
    }
    public String minWindow(String s, String t) {
        String ret = "";
        int[] tValues = new int[52];
        int[] windowValues = new int[52];
        int remaing = 0;
        int index = 0, leftIndex = 0;

        for (char c : t.toCharArray()) {
            
            tValues[getIndex(c)]++;
            remaing++;
        }
        int left = 0, len = Integer.MAX_VALUE;
        for (int rigth = 0; rigth < s.length(); rigth++) {
            
            char c = s.charAt(rigth);
            index = getIndex(c);
            if (tValues[index] > 0) {
                windowValues[index]++;
                if (windowValues[index] <= tValues[index]) {
                    remaing--;
                }
            }
            while (remaing == 0) {
                int size = rigth - left;
                if (size < len) {
                    len = size;
                    ret = s.substring(left, rigth + 1);
                }
                char leftc = s.charAt(left);
                leftIndex = getIndex(leftc);                
                if (windowValues[leftIndex] > 0){
                    windowValues[leftIndex]--;
                    if (tValues[leftIndex] > windowValues[leftIndex]){
                        remaing++;
                    }
                }
                left++;
            }
            
        }
        return ret;
        
    }
}
