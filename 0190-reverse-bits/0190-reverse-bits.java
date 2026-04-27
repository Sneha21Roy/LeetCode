public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            result = result << 1;      // left shift result
            result = result | (n & 1); // add last bit of n
            n = n >> 1;               // shift n
        }
        
        return result;
    }
}