package src.BinarySearchTree;


import java.util.Stack;

public class validBST {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack();
        double left_child_val = -Double.MAX_VALUE;

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.val <= left_child_val) return false;
            left_child_val = root.val;
            root = root.right;

        }
        return true;
    }
    public static void main(String[] args) {
        // Example usage:
        // Create a sample binary search tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        // Create an instance of validBST
        validBST validator = new validBST();

        // Check if the binary search tree is valid
        boolean isValid = validator.isValidBST(root);
        System.out.println("Is the binary search tree valid? " + isValid); // Output should be "true"
    }
}
