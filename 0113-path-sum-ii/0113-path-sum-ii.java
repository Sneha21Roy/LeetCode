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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), result);
        return result;
    }
    
    public void dfs(TreeNode node, int remaining, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;
        
        // Current node ko path mein daalo
        path.add(node.val);
        remaining= remaining - node.val;
        
        // Leaf node hai aur sum match karta hai
        if (node.left == null && node.right == null && remaining == 0) {
            result.add(new ArrayList<>(path));  // Copy banana zaroori hai!
        }
        
        // Left aur right subtree explore karo
        dfs(node.left, remaining, path, result);
        dfs(node.right, remaining, path, result);
        
        // Backtrack — current node ko hataao
        path.remove(path.size() - 1);
    }
}