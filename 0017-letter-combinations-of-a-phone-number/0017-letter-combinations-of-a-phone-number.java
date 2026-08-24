class Solution {

    String[] letters = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, "");

        return ans;
    }

    void backtrack(String digits, int index, String current) {

        // Base case
        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        // Current digit
        int digit = digits.charAt(index) - '0';

        String chars = letters[digit];

        // Try every character
        for (int i = 0; i < chars.length(); i++) {

            char ch = chars.charAt(i);

            backtrack(
                digits,
                index + 1,
                current + ch
            );
        }
    }
}