package src.BinarySearchTree;

import src.BinarySearchTree.TreeNode;

public class LowestCommanAnsector {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        System.out.println("Lowest Common Ancestor leftLCA : " + leftLCA);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);
        System.out.println("Lowest Common Ancestor rightLCA : " + rightLCA);


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


        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(8);

        TreeNode p1 = root1.left;  // Node with value 5
        TreeNode q1 = root1.right; // Node with value 1
        TreeNode lca1 = solution.lowestCommonAncestor(root1, p1, q1);
        System.out.println("Lowest Common Ancestor: " + lca1.val);  // Output should be 3

    }
}
