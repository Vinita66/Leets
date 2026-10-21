class Solution {
    public int findPermutationDifference(String s, String t) {
        int diff = 0;
        int i;
        for(i = 0; i < s.length(); i++){
            int j;
            for(j = 0; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    diff += Math.abs(i-j);
                    
                }
            }
        }return diff;
    }
}