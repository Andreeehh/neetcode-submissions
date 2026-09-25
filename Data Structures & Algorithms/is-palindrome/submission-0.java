class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String r = "";

        for (int i = 0; i < s.length(); i++){
            r = s.charAt(i) + r; 
        }
        return r.equalsIgnoreCase(s);
    }
}
