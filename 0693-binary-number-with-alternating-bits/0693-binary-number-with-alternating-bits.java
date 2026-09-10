class Solution {
    public boolean hasAlternatingBits(int n) {
        
        while(n > 0){
            int bit1 = n % 2;
            n = n / 2;
            int bit2 = n % 2;

            if(bit1 == bit2 && n > 0){
                return false;
            }
        }
        return true;
    }
}