class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        // Maximum pile find karo
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int low = 1;
        int high = max;

        while (low < high) {

            int mid = low + (high - low) / 2;

            long totalHours = 0;

            // Current speed par total hours calculate karo
            for (int i = 0; i < piles.length; i++) {
                totalHours += Math.ceil(
                    (double) piles[i] / mid
                );
            }

            if (totalHours <= h) {
                // Current speed works
                // Smaller speed try karo
                high = mid;
            } else {
                // Current speed slow hai
                low = mid + 1;
            }
        }

        return low;
    }
}