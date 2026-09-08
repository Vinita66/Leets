class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String currentWord = words[i];
            boolean isConsistent = true;

            for(int j = 0; j < currentWord.length(); j++){
                char c = currentWord.charAt(j);
                if(allowed.indexOf(c) == -1){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}