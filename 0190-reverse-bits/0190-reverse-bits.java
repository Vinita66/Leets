class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        binary = String.format("%32s", binary).replace(' ', '0');

        StringBuilder reversed = new StringBuilder();
        for(int i = binary.length()-1; i >= 0; i--){
            reversed.append(binary.charAt(i));
        }
        return (int) Long.parseLong(reversed.toString(), 2);
    }
}