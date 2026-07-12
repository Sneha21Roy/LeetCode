class Solution {
    public double myPow(double x, int n) {
        long N = n;          // convert to long to avoid overflow

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;

        while (N > 0) {
            if (N % 2 == 1) {   // if power is odd
                result *= x;
            }
            x *= x;            // square the base
            N /= 2;            // halve the power
        }

        return result;
    }
}
