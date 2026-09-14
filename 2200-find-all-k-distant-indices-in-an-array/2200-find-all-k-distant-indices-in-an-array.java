class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        int sub = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == key){
                    sub = Math.abs(i-j);
                    if(sub <= k){
                        ans.add(i);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}