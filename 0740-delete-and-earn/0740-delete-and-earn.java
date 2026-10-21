
class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxNum = 0;

        for (int i = 0; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
        }

        int[] points = new int[maxNum + 1];

        for (int i = 0; i < nums.length; i++) {
            points[nums[i]] += nums[i];
        }

        int[] dp = new int[maxNum + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        return func(0, points, dp);
    }

    public int func(int i, int[] points, int[] dp) {

        // Base case
        if (i >= points.length) {
            return 0;
        }

        // Already calculated
        if (dp[i] != -1) {
            return dp[i];
        }

        // Take
        int take = points[i] + func(i + 2, points, dp);

        // Not Take
        int notTake = func(i + 1, points, dp);

        return dp[i] = Math.max(take, notTake);
    }
}
