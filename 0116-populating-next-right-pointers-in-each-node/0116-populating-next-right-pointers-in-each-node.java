import java.util.*;

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                level.add(current);

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            for (int j = 0; j < level.size() - 1; j++) {
                level.get(j).next = level.get(j + 1);
            }
        }

        return root;
    }
}