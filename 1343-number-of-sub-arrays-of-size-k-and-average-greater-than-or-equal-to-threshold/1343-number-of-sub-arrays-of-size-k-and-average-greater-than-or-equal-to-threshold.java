class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int arrCount = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
            
        }
        if(sum/k >= threshold){
            arrCount++;
        }
        for(int i = k; i < n; i++){
            sum = sum - arr[i-k] + arr[i];
            if(sum/k >= threshold){
                arrCount++;
            }
        }return arrCount;
    }
}