class Solution {
    // start se end tak ke elements ko reverse karta hai
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;                  // k >= n ho toh extra chakkar hata do

        reverse(nums, 0, n - 1);    // 1. poora array reverse
        reverse(nums, 0, k - 1);    // 2. pehle k elements reverse
        reverse(nums, k, n - 1);    // 3. baaki n-k elements reverse
    }
}