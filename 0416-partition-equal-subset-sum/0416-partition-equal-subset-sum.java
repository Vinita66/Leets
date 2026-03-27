class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) return false;

        int target = sum / 2;

        Boolean[][] dp = new Boolean[nums.length + 1][target + 1];

        return subsetSum(nums, nums.length, target, dp);
    }

    public boolean subsetSum(int[] nums, int n, int target, Boolean[][] dp) {
        if (target == 0) return true;
        if (n == 0) return false;
        if (dp[n][target] != null) {
            return dp[n][target];
        }

        if (nums[n - 1] > target) {
            return dp[n][target] = subsetSum(nums, n - 1, target, dp);
        }

        return dp[n][target] =
                subsetSum(nums, n - 1, target - nums[n - 1], dp) ||
                subsetSum(nums, n - 1, target, dp);
    }
}