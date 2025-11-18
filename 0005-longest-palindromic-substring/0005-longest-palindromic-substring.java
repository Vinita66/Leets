class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            
            String odd = expand(s, i, i);
            
            String even = expand(s, i, i + 1);

            
            if (odd.length() > maxLen) {
                maxLen = odd.length();
                res = odd;
            }
            if (even.length() > maxLen) {
                maxLen = even.length();
                res = even;
            }
        }
        return res;
    }
    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
}