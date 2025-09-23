class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
        int left = 0, right = 0;
        int sum = 0, minLen = Integer.MAX_VALUE;

        while (right < n) {         
            sum += nums[right++];   

            
            while (sum >= target) {
                minLen = Math.min(minLen, right - left);
                sum -= nums[left++];
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
        
         
    }
}