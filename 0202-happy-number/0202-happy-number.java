class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        while (n != 1) {

            if (map.containsKey(n)) {
                return false; 
            }

            map.put(n, true);

            n = squareSum(n);
        }

        return true; 
    }

    private int squareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    
    }
}