package src.questionBank;

import  src.BinarySearchTree.TreeNode;
import src.BinarySearchTree.validBST;

/**
 * use main method
 * left_node_temp = -Double.MAX_VALUE -- strange
 * left.right.value > left.value -- concept
 * compare
 */
public class validateBST {
    public boolean isValidBST(TreeNode root) {
        return true;
    }
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
    /**
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     *
     * A valid BST is defined as follows:
     *
     * The left
     * subtree
     *  of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     *
     *
     * Example 1:
     *
     *
     * Input: root = [2,1,3]
     * Output: true
     * Example 2:
     *
     *
     * Input: root = [5,1,4,null,null,3,6]
     * Output: false
     * Explanation: The root node's value is 5 but its right child's value is 4.
     *
     *
     * Constraints:
     *
     * The number of nodes in the tree is in the range [1, 104].
     * -231 <= Node.val <= 231 - 1
     * @param root
     * @return
     */


    /**
     * # Create a valid BST
     * #        5
     * #       / \
     * #      3   7
     * #     / \ / \
     * #    2  4 6  8
     */
   /* public static void main(String[] args) {
        // Example usage:
        // Create a sample binary search tree
        TreeNode root = new TreeNode(5);
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        // Create an instance of validBST
        validBST validator = new validBST();

        // Check if the binary search tree is valid
        boolean isValid = validator.isValidBST(root);
        System.out.println("Is the binary search tree valid? " + isValid); // Output should be "true"
    }*/
}
