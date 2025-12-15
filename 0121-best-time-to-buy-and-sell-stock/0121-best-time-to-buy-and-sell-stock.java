class Solution {
    int[][][] dp;

    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][2][2]; 

        for (int i = 0; i < n; i++)
            for (int b = 0; b < 2; b++)
                for (int t = 0; t < 2; t++)
                    dp[i][b][t] = -1;

        return solve(prices, 0, 1, 1);
    }

    public int solve(int[] arr, int i, int buy, int trans) {
        if (i == arr.length || trans == 0)
            return 0;

        if (dp[i][buy][trans] != -1)
            return dp[i][buy][trans];

        int profit;
        if (buy == 1) {
            profit = Math.max(
                    -arr[i] + solve(arr, i + 1, 0, trans), 
                    solve(arr, i + 1, 1, trans)           
            );
        } else {
            profit = Math.max(
                    arr[i] + solve(arr, i + 1, 1, trans - 1), 
                    solve(arr, i + 1, 0, trans)               
            );
        }

        return dp[i][buy][trans] = profit;
    }
}