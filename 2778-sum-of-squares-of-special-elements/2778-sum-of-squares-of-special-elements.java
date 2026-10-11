class Solution {
    public int sumOfSquares(int[] nums) {
        
        int product = 1;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums.length % (i+1) == 0){
                product = nums[i]*nums[i];
                sum = sum+product;
            }
        }return sum;
    }
}