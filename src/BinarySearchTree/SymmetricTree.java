package src.BinarySearchTree;

import java.util.Stack;

/**
 * markdown
 * Copy code
 *         1
 *        / \
 *       2   2
 *      / \ / \
 *     3  4 4  3
 * When you traverse the tree level by level, you will encounter the following node pairs at each level:
 *
 * Level 1: [1, 1]
 * Level 2: [2, 2]
 * Level 3: [3, 3] [4, 4]
 * Level 4: []
 *
 * In the last level, you have two empty branches for the left and right nodes,
 * but they don't need to be compared because there's nothing to compare.
 * That's why the continue statement is used to skip further checks in this situation.
 */
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(3);

        boolean isSymmetric = isSymmetric(root);
        System.out.println("Is the tree symmetric? " + isSymmetric);
    }

    private static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty()){
          TreeNode nodeRight = stack.pop();
          TreeNode nodeLeft = stack.pop();

          if(nodeRight == null && nodeLeft == null) continue;

            if (nodeLeft == null || nodeRight == null || nodeRight.val != nodeLeft.val) {
                return false;
            }
          stack.push(nodeRight.left);
          stack.push(nodeLeft.right);

          stack.push(nodeRight.right);
          stack.push(nodeLeft.left);
        }
        return true;
    }
}
