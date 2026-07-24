class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int diff = 0;
        int max = 0;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            diff = nums[i] - nums[i-1];
            max = Math.max(max, diff);
        }
        return max;
    }
}