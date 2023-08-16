package src.BinarySearchTree;

import src.BinarySearchTree.TreeNode;
/*
        5
       / \
      2   8
     / \ / \
    1  3 6  9
 */
class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pval = p.val;
        int qval = q.val;
        while (root != null) {
            int rootval = root.val;
            //BOTH ARE ON RIGHT
            if (pval > rootval && qval > rootval) {
                root = root.right;
                //BOTH ON LEFT
            } else if (pval < rootval && qval < rootval) {
                root = root.left;
            } else {
                //ROOT IS THE SOLUTION
                return root;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        LowestCommonAncestor solution = new LowestCommonAncestor();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode p = new TreeNode(2);  // Node with value 2
        TreeNode q = new TreeNode(3); // Node with value 6

        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor: " + lca.val);  // Output should be 5
//three condition
        /**
         * 1. if both the nodes are of right, the root = root.right
         * 2. if both the nodes are of left, the root = root.left
         * 3. if one if on left, one is on right then it's root
         */
    }
}