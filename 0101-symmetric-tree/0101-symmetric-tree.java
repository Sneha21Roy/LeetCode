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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
    return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode left,TreeNode right){
        // if both left and right are null then true because symmetric will also be null
        if(left==null && right==null) return true;
        // if any one will be null then it will return false
        if(left==null || right==null) return false;
        // values should also match
        if(left.val!=right.val) return false;

        return isMirror(left.left,right.right)
              && isMirror (left.right,right.left);
    }
}