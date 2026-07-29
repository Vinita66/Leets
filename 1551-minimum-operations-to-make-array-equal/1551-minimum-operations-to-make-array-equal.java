class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = 2 * i + 1;
        }
        int left = 0;
        int right = n-1;
        int minOperation = 0;
        while(left < right){
            while(arr[left] < arr[right]){
                arr[left]++;
                arr[right]--;
                minOperation++;
            }
            left++;
            right--;
        }
        return minOperation;
    }
}