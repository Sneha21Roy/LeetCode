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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
                if(root==null){
                    return result;
                }
       Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);
         while(!queue.isEmpty())// this loop will run until the queue is not empty
         {
             int size=queue.size();// for traversing the level (current level )
             List<Integer> level = new ArrayList<>();// for storing the current nodes like 9,20...
             for(int i=0;i<size;i++){//for storing the current level of notes it will run according to level of nodes if 2 then it will run 2 times
             TreeNode current=queue.poll();// to remove the elements
              level.add(current.val);// jo v poll hote jayega
             if(current.left!=null){
                queue.offer(current.left);
             }
             if(current.right!=null){
                queue.offer(current.right);
             }        
            }
            result.add(level);
       }
       return result;
    }
}