class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);  

        
        ArrayList<int[]> list = new ArrayList<>();

        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                list.add(new int[]{nums[i - 1], count});
                count = 1;
            }
        }

        
        list.add(new int[]{nums[nums.length - 1], count});

        
        Collections.sort(list, (a, b) -> b[1] - a[1]);

       
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[0];
        }

        return result;
    }
}