class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
            
        }
        HashMap<Integer, Integer> count  = new HashMap<>();
        for(int freq : map.values()){
            count.put(freq, count.getOrDefault(freq,0)+1);
        }
        for(int num: nums){
            if(count.get(map.get(num)) == 1){
                return num;
            }
        }
        return -1;
    }
}