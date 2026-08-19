class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < 2*n; i++){
            int index = i%n;
            while(!s.isEmpty() && nums[index] > nums[s.peek()]){
                int prev = s.pop();
                ans[prev] = nums[index];
            }
            if(i < n){
                s.push(index);
            }
            
        }while(!s.isEmpty()){
            ans[s.pop()] = -1;
        }
        return ans;
    }
}