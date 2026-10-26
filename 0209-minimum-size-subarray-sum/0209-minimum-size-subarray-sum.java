
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (high < nums.length) {
            sum += nums[high];

            while (sum >= target) {
                minLength = Math.min(minLength, high - low + 1);
                sum -= nums[low];
                low++;
            }

            high++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

