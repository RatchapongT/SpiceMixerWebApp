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
    public int closestValue(TreeNode root, double target) {
        int closestValue = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(closestValue - target)) {
                closestValue = root.val;
            }
            root = target > root.val ? root.right : root.left;
        }
        return closestValue;
    }
}