class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null) return true;      
        if (magazine == null) return false;       
        Map<Character, Integer> freq = new HashMap<>();

        
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int available = freq.getOrDefault(c, 0);
            if (available == 0) {
                return false; 
            }
            freq.put(c, available - 1);
        }

        return true;

    }
    
}