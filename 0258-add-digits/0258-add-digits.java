class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            String s = String.valueOf(num);
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                int digit = s.charAt(i)-'0';
                sum += digit;
            
            }
            num = sum;
        }
        return num;
    }
}