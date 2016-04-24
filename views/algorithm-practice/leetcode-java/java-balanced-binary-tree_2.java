/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {


    public int heightDFS(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = heightDFS(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = heightDFS(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }


    public boolean isBalanced(TreeNode root) {
        return heightDFS(root) != -1;

    }

}