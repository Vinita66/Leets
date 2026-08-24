class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = -1;
        

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            
            if(map.containsKey(c)){
                int length = i-map.get(c)-1;
                max = Math.max(max,length);
            }else{
                map.put(c,i);
            }
        }
        return max;
    }
}