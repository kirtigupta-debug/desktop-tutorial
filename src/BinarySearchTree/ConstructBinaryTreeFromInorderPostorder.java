package src.BinarySearchTree;

/**
 * https://www.youtube.com/watch?v=0r_cx1c8Z1A&ab_channel=Codebix
 */
public class ConstructBinaryTreeFromInorderPostorder {
    //Input: inorder = [9,3,15,20,7],
    // postorder = [9,15,7,20,3]
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,postorder,0,inorder.length-1,0,postorder.length-1);

    }
    private TreeNode  helper(int[] inorder, int[] postorder,int inorderStart,int inorderEnd,int postorderStart,int postorderEnd)
    {
        if (inorderEnd < inorderStart) {
            return null;
        }
        int rootVal = postorder[postorderEnd];
        TreeNode root = new TreeNode(rootVal);

        //find 3 in inorder
        int rootIndex = inorderStart;
        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        //in inorder the left and right tree size
        int inorderLeftTreeSize = rootIndex - inorderStart; //1
        int inorderRightTreeSize = inorderEnd - rootIndex; //3

        root.left = helper(inorder,postorder,inorderStart,rootIndex -1, postorderStart,postorderStart+inorderLeftTreeSize-1 );
        root.right = helper(inorder,postorder,rootIndex+1,inorderEnd,postorderEnd-inorderRightTreeSize,postorderEnd-1);
        return root;
    }
    public static void main(String[] args) {
        ConstructBinaryTreeFromInorderPostorder builder = new ConstructBinaryTreeFromInorderPostorder();

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = builder.buildTree(inorder, postorder);

        System.out.println("Inorder Traversal of Constructed Tree:");
        builder.inorderTraversal(root);
    }
    // Inorder traversal for verification
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

}
