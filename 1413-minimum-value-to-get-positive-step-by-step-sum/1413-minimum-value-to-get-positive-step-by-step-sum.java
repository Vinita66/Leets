class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum = sum+nums[i];
            if(sum < minSum){
                minSum = sum;
            }
        }
        int startValue = 1-minSum;
        return startValue;

    }
}