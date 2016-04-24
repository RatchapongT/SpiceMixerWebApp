/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
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
        List<TreeNode> leftTree = new LinkedList<>();
        List<TreeNode> rightTree = new LinkedList<>();
        leftTree.add(root.left);
        rightTree.add(root.right);
        while (leftTree.size()>0 && rightTree.size()>0) {
            TreeNode l = leftTree.remove(0);
            TreeNode r = rightTree.remove(0);
            if(l.val != r.val) {
                return false;
            }
            if(l.left != null) {
                leftTree.add(l.left);
            }
            if(r.right != null) {
                rightTree.add(r.right);
            }
            if (leftTree.size() != rightTree.size()) return false;

            if(l.right != null) {
                leftTree.add(l.right);
            }
            if(r.left != null) {
                rightTree.add(r.left);
            }
            if (leftTree.size() != rightTree.size()) return false;

        }
        return true;

    }
}