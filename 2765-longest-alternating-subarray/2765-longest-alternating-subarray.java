class Solution {
    public int alternatingSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = -1;
        int i = 0;

        while (i < n - 1) {
            // Check if valid start (+1 difference)
            if (nums[i + 1] - nums[i] != 1) {
                i++;
                continue;
            }

            int j = i + 1;
            int expected = -1; // next difference should be -1

            // Extend subarray while pattern holds
            while (j < n - 1 && nums[j + 1] - nums[j] == expected) {
                expected *= -1; // flip between -1 and +1
                j++;
            }

            maxLen = Math.max(maxLen, j - i + 1);

            // Jump to end of current valid segment
            i = j;
        }

        return maxLen;
    }
}