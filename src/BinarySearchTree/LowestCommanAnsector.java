package src.BinarySearchTree;

import src.BinarySearchTree.TreeNode;

public class LowestCommanAnsector {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return root; // Nodes are in different subtrees, so root is LCA
        } else if (leftLCA != null) {
            return leftLCA; // LCA found in the left subtree
        } else {
            return rightLCA; // LCA found in the right subtree
        }

    }

    public static void main(String[] args) {
        LowestCommanAnsector solution = new LowestCommanAnsector();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;                      // Node with value 5
        TreeNode q = root.left.right.right.left;     // Node with value 4

        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor: " + lca.val);  // Output should be 5
    }
}
