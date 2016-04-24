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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> nodeStack = new LinkedList<>();
        Queue<Integer> maxStack = new LinkedList<>();
        nodeStack.add(root);
        maxStack.add(1);
        int maxDepth = Integer.MIN_VALUE;
        while (nodeStack.size() > 0) {
            TreeNode currentNode = nodeStack.remove();
            int currentDepth = maxStack.remove();

            if (currentNode.left != null) {
                nodeStack.add(currentNode.left);
                maxStack.add(currentDepth + 1);
            }
            if (currentNode.right != null) {
                nodeStack.add(currentNode.right);
                maxStack.add(currentDepth + 1);
            }

            if (nodeStack.size() == 0) {
                return currentDepth;
            }

        }
        return -1;
    }
}