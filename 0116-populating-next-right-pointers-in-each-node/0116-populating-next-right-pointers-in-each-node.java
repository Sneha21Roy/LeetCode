/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
       
        if(root==null){
            return root;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
        List<TreeNode> level=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode current=queue.poll();
            if(current.left!=null){
                queue.offer(current.left);
            }
             if(current.right!=null){
                queue.offer(current.right);
            }
            level.add(current);
    }
    for(j=0;j<i.size()-1;j++){
        level.get(i).next=i.get(i+1);
    }
    return root;
}
