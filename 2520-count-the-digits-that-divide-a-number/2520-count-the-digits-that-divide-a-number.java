class Solution {
    public int countDigits(int num) {
        String s = String.valueOf(num);
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            if(num % digit == 0){
                count++;
            }
        }return count;
    }
}