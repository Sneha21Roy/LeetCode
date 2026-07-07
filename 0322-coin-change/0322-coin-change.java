class Solution {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        // Initialize all values with Infinity
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Base Case
        dp[0] = 0;

        // Fill DP Array
        for (int i = 1; i <= amount; i++) {

            // Try every coin
            for (int j = 0; j < coins.length; j++) {

                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {

                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);

                }
            }
        }

        // If amount cannot be formed
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        // Otherwise return minimum coins
        return dp[amount];
    }
}