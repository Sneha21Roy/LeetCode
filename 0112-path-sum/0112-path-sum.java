/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.push(root);
        sumStack.push(root.val);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int sum = sumStack.pop();

            // check leaf
            if (node.left == null && node.right == null) {
                if (sum == targetSum) return true;
            }

            if (node.right != null) {
                nodeStack.push(node.right);
                sumStack.push(sum + node.right.val);
            }

            if (node.left != null) {
                nodeStack.push(node.left);
                sumStack.push(sum + node.left.val);
            }
        }

        return false;
    }
}
