import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(candidates, target, 0, current, result);

        return result;
    }

    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> current, List<List<Integer>> result) {

        // Base Case: If target becomes 0 → valid combination found
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If target becomes negative → stop exploring this path
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // Explore (reuse allowed → pass i)
            backtrack(candidates, target - candidates[i], i, current, result);

            // Backtrack (undo choice)
            current.remove(current.size() - 1);
        }
    }
}
//Add current number
// - Reduce target
// - Recurse from same index (since repetition allowed)
// - Backtrack by removing last number

// If target == 0 → store result
// If target < 0 → stop that path