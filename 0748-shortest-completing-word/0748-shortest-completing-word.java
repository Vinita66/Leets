class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> need = new HashMap<>();
        for(char c : licensePlate.toCharArray()){
            if(Character.isLetter(c)){
                c = Character.toLowerCase(c);
                need.put(c,need.getOrDefault(c,0)+1);
            }
        }
        String answer = "";
        for(String word : words){
            HashMap<Character, Integer> count = new HashMap<>();
            for(char c : word.toCharArray()){
                count.put(c,count.getOrDefault(c,0)+1);
            }
            boolean complete = true;
            for(char c : need.keySet()){
                if(count.getOrDefault(c,0) < need.get(c)){
                    complete = false;
                    break;
                }
            }
            if(complete){
                if(answer.equals("") || word.length() < answer.length()){
                    answer = word;
                }
            }
        }
         return answer;
    }
}