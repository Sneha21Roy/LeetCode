class Solution {
    public int countBinarySubstrings(String s) {
        
        int prevGroup = 0;
        int currGroup = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            
            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            } else {
                
                // Add minimum of previous and current group
                count += Math.min(prevGroup, currGroup);

                prevGroup = currGroup;
                currGroup = 1;
            }
        }

        // For the last group
        count += Math.min(prevGroup, currGroup);

        return count;
    }
}