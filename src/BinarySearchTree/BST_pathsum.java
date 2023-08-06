package src.BinarySearchTree;
import java.util.Stack;
public class BST_pathsum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.push(root);
        sumStack.push(targetSum - root.val);

        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.pop();
            int currentSum = sumStack.pop();

            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            }

            if (currentNode.right != null) {
                nodeStack.push(currentNode.right);
                sumStack.push(currentSum - currentNode.right.val);
            }

            if (currentNode.left != null) {
                nodeStack.push(currentNode.left);
                sumStack.push(currentSum - currentNode.left.val);
            }
        }
      return false;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;

        BST_pathsum solution = new BST_pathsum();
        boolean result = solution.hasPathSum(root, targetSum);
        System.out.println(result);  // Output: true
    }
}
