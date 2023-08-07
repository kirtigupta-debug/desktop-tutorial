package src.BinarySearchTree;

import java.util.Stack;

public class sumofleftLeaves {

        public static int sumOfLeftLeaves(TreeNode root) {
            if (root == null) return 0;
            int sum_counter = 0;
            Stack<TreeNode> traversal_stack = new Stack<>();
            traversal_stack.push(root);  // Push the root onto the stack to start traversal
            while (!traversal_stack.isEmpty()) {
                TreeNode current_node = traversal_stack.pop();
                if (current_node.left != null) {
                    if (current_node.left.left == null && current_node.left.right == null) {
                        sum_counter = sum_counter + current_node.left.val;
                    } else {
                        traversal_stack.push(current_node.left);
                    }
                }
                if (current_node.right != null) {
                    traversal_stack.push(current_node.right);
                }
            }

            return sum_counter;

    }
    public static void main(String[] args) {
       TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        int sum = sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + sum);  // Expected output: 24
    }
}
