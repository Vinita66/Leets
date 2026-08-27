class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                count++;
            }
        }        
        if (count == 0) {
            return nums;
        }
        k = k % count;

      
        int[] temp = new int[count];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                temp[j++] = nums[i];
            }
        }       
        int[] rotated = new int[count];
        j = 0;
        for (int i = k; i < count; i++) {
            rotated[j++] = temp[i];
        }
        for (int i = 0; i < k; i++) {
            rotated[j++] = temp[i];
        }       
        j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated[j++];
            }
        }
        return nums;
    }
}