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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        Stack<TreeNode> leftTree = new Stack<>();
        Stack<TreeNode> rightTree = new Stack<>();
        leftTree.push(root.left);
        rightTree.push(root.right);
        while (leftTree.size() > 0 && rightTree.size() > 0) {
            TreeNode l = leftTree.remove(0);
            TreeNode r = rightTree.remove(0);
            if (l.val != r.val) {
                return false;
            }
            if (l.left != null) {
                leftTree.push(l.left);
            }
            if (r.right != null) {
                rightTree.push(r.right);
            }
            if (leftTree.size() != rightTree.size()) return false;

            if (l.right != null) {
                leftTree.push(l.right);
            }
            if (r.left != null) {
                rightTree.push(r.left);
            }
            if (leftTree.size() != rightTree.size()) return false;

        }
        return true;

    }
}