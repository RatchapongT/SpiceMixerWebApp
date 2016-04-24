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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> nodeStack = new LinkedList<>();
        Queue<Integer> depthStack = new LinkedList<>();
        nodeStack.add(root);
        depthStack.add(1);

        while (nodeStack.size() > 0) {
            TreeNode currentNode = nodeStack.remove();
            int currentDepth = depthStack.remove();
            if (currentNode.left != null) {
                nodeStack.add(currentNode.left);
                depthStack.add(currentDepth + 1);
            }
            if (currentNode.right != null) {
                nodeStack.add(currentNode.right);
                depthStack.add(currentDepth + 1);
            }

            if (currentNode.left == null && currentNode.right == null) {
                return currentDepth;
            }

        }
        return 0;
    }

}