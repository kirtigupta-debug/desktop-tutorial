package src.BinarySearchTree;

public class KthLargestElementBST {
    int counter = 0;
    int result = 0;

    public int kthLargest(TreeNode root, int k) {
        if(root == null) return 0;
        recKthLargest(root,k);
        return result;
    }

    public void recKthLargest(TreeNode root, int k) {
        if (root.right != null) {
            recKthLargest(root.right, k);
        }
        counter++;
        if (counter == k) {
            result = root.val;
            return;
        }
        if (root.left != null) {
            recKthLargest(root.left, k);
        }
    }
    public static void main(String[] args) {
        KthLargestElementBST solution = new KthLargestElementBST();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        int k = 1;  // Find the 3rd largest element

        int kthLargest = solution.kthLargest(root, k);
        System.out.println("Kth kthLargest Element: " + kthLargest);  // Output should be 6
    }
}
