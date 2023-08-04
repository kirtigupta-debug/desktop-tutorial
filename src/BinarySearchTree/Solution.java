package src.BinarySearchTree;
import java.util.*;
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
    public boolean isValidBST(TreeNode root)
    {
        if(root == null) return true;
        double left_temp = - Double.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = root.left;
            if(root.val<=left_temp) return false;
            left_temp = root.val;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {
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
    }
    /**
     * # Create a valid BST
     * #        5
     * #       / \
     * #      3   7
     * #     / \ / \
     * #    2  4 6  8
     */
}