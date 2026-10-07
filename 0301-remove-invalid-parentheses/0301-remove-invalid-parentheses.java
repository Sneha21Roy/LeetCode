import java.util.*;

class Solution {

    Set<String> result = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {

        int left = 0;
        int right = 0;

        // Find minimum number of '(' and ')' to remove
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                left++;
            } 
            else if (s.charAt(i) == ')') {

                if (left > 0) {
                    left--;
                } 
                else {
                    right++;
                }
            }
        }

        backtrack(s, 0, 0, 0, left, right, "");

        return new ArrayList<>(result);
    }

    void backtrack(String s, int index, int balance,
                   int removed, int leftRemove,
                   int rightRemove, String current) {

        if (index == s.length()) {

            if (balance == 0 &&
                leftRemove == 0 &&
                rightRemove == 0) {

                result.add(current);
            }

            return;
        }

        char ch = s.charAt(index);

        // Case 1: Current character is '('
        if (ch == '(') {

            // Remove it
            if (leftRemove > 0) {
                backtrack(
                    s, index + 1, balance,
                    removed + 1,
                    leftRemove - 1,
                    rightRemove,
                    current
                );
            }

            // Keep it
            backtrack(
                s, index + 1,
                balance + 1,
                removed,
                leftRemove,
                rightRemove,
                current + ch
            );
        }

        // Case 2: Current character is ')'
        else if (ch == ')') {

            // Remove it
            if (rightRemove > 0) {
                backtrack(
                    s, index + 1, balance,
                    removed + 1,
                    leftRemove,
                    rightRemove - 1,
                    current
                );
            }

            // Keep it only if balance > 0
            if (balance > 0) {
                backtrack(
                    s, index + 1,
                    balance - 1,
                    removed,
                    leftRemove,
                    rightRemove,
                    current + ch
                );
            }
        }

        // Case 3: Letter
        else {
            backtrack(
                s, index + 1,
                balance,
                removed,
                leftRemove,
                rightRemove,
                current + ch
            );
        }
    }
}