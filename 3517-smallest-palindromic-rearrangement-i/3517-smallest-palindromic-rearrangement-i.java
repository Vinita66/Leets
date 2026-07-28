class Solution {
    public String smallestPalindrome(String s) {
        int[] count  = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        int oddIndex = -1;
        for(int i = 0; i < 26; i++){
            if(count[i] % 2 != 0){
                oddIndex = i;
                break;
            }
        }
        StringBuilder firstHalf = new StringBuilder();
        for(int i = 0; i < 26; i++){
            int halfCount = count[i]/2;
            for(int j = 0; j < halfCount; j++){
                firstHalf.append((char)(i+'a'));
            }
        }
        StringBuilder result = new StringBuilder(firstHalf);
        if(oddIndex != -1){
            result.append((char)(oddIndex+'a'));
        }result.append(new StringBuilder(firstHalf).reverse());
        return result.toString();
    }
}
