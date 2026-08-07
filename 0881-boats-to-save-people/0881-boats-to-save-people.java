class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int sum = 0;
        int count = 0;
        int left = 0;
        int right = n-1;
        while(left <= right){
            sum = people[left] + people[right];
            if(sum <= limit){
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}