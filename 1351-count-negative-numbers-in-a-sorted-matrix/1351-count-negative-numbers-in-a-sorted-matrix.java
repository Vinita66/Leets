class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int left = 0;
            int right = grid[0].length - 1;
            int firstNeg = grid[0].length;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (grid[i][mid] < 0) {
                    firstNeg = mid;
                    right = mid - 1; 
                } else {
                    left = mid +1 ;
                }
            }

            count += (grid[0].length - firstNeg);
        }

        return count;
    }
}