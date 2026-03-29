import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        generate(nums, 0, stack, result);

        return result;
    }

    public void generate(int[] nums, int index, Stack<Integer> stack, List<List<Integer>> result) {

        // Add current subset to result
        result.add(new ArrayList<>(stack));

        for (int i = index; i < nums.length; i++) {

            // Include element(adding theelement)
            stack.push(nums[i]);

            // Recurse (moving to next element)
            generate(nums, i + 1, stack, result);

            // Backtrack back to element
            stack.pop();
        }
    }
}