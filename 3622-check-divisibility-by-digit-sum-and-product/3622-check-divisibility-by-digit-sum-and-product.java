class Solution {
    public boolean checkDivisibility(int n) {
        String s = String.valueOf(n);
        int product = 1;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int digit = s.charAt(i)-'0';
            product *= digit;
            sum += digit;
            
        }
        return n % (sum + product) == 0;
    }
}