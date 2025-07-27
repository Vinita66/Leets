class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] hash = new int[256]; // ASCII size
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (hash[ch] == 1) break; // duplicate found
                hash[ch] = 1;
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }
}