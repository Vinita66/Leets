class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = Arrays.binarySearch(nums, target);
        if (first < 0) return new int[]{-1, -1};

        int start = first;
        int end = first;

        
        while (start - 1 >= 0 && nums[start - 1] == target) start--;
        while (end + 1 < nums.length && nums[end + 1] == target) end++;

        return new int[]{start, end};
    }
}