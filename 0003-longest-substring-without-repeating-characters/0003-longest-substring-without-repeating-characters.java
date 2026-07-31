class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] count = new int[256];

        int first = 0;
        int second = 0;
        int len = 0;

        while (second < s.length()) {

            // Agar current character already window mein hai
            while (count[s.charAt(second)] == 1) {

                count[s.charAt(first)] = 0;
                first++;
            }

            // Current character ko window mein add karo
            count[s.charAt(second)] = 1;

            // Maximum length update karo
            len = Math.max(len, second - first + 1);

            // Right pointer aage badhao
            second++;
        }

        return len;
    }
}