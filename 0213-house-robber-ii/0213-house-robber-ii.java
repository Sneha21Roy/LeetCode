class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = find(nums, 0, n - 2, dp1);
        int case2 = find(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    int find(int[] nums, int index, int end, int[] dp) {
        if (index > end) return 0;

        if (dp[index] != -1) return dp[index];

        int n1 = nums[index] + find(nums, index + 2, end, dp);
        int n2 = find(nums, index + 1, end, dp);

        return dp[index] = Math.max(n1, n2);
    }
}