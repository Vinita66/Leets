class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int l = 0;
        int max = 1;
        for(int r = 1; r < n; r++){
            if(nums[r-1] < nums[r]){
                max = Math.max(max, r - l + 1);
            }else{
                l = r;
            }
        }return max;
    }
}