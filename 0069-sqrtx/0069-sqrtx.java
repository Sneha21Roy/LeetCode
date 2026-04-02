class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;
            } 
            else if (sq < x) {
                ans = mid;      // possible answer
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
