class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int evenPlace = 0;
        int oddPlace = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[evenPlace] = nums[i];
                evenPlace += 2;
            }else{
                ans[oddPlace] = nums[i];
                oddPlace += 2;
            }
        }    
        return ans;
    }
}