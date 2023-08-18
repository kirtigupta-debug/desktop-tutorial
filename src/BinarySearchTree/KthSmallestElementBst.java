package src.BinarySearchTree;

public class KthSmallestElementBst {


    int count = 0;
    int out = 0;

    public static void main(String[] args) {
        KthSmallestElementBst solution = new KthSmallestElementBst();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        int k = 1;  // Find the 3rd largest element

        int kthSmallest = solution.kthSmallest(root, k);
        System.out.println("Kth smallest Element: " + kthSmallest);  // Output should be 6
    }

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return 0;
        rec(root, k);
        return out;
    }

    public int rec(TreeNode root, int k) {
        if (root.left != null) {
            rec(root.left, k);
        }
        count = count + 1;
        if (count == k) {
            out = root.val;
            return k;
        }

        if (root.right != null) {
            rec(root.right, k);
        }

        return k;
    }

}

