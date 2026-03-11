class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0){
            return 1;
        }
        String binary = Integer.toBinaryString(n);
        String complement="";
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '0'){
                complement += '1';
            }else{
                complement += '0';
            }
        }
        int result = 0;

        for(int i = 0; i < complement.length(); i++){
            result = result * 2 + (complement.charAt(i) - '0');
        }

        return result;
    }
}