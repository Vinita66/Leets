class Solution {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        int product = 1;
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            product *= digit;
            sum += digit;
            result = product-sum;
        }
        return result;
    }
}