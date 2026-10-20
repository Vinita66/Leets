class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int secLarg = -1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                int num = c - '0';
                if(num > largest){
                    secLarg = largest;
                    largest = num;
                }else if(num < largest && num > secLarg){
                    secLarg = num;
                }
            }
        }return secLarg;
    }
}