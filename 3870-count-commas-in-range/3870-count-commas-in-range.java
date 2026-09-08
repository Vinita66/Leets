class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0;
        }
        
        int commas = 0;
        for(long x = 1000; x <= n; x *= 1000){
            commas += (n-x+1);
        }
        return commas;
    }
}