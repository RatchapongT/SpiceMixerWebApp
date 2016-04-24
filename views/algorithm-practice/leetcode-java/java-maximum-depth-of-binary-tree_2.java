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
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        nodeStack.push(root);
        maxStack.push(1);
        int maxDepth = Integer.MIN_VALUE;
        while (!nodeStack.empty()) {
            TreeNode currentNode = nodeStack.pop();
            int currentDepth = maxStack.pop();
            if (currentNode.left == null && currentNode.right == null) {
                maxDepth = Math.max(maxDepth, currentDepth);
            } else {
                if (currentNode.left != null) {
                    nodeStack.push(currentNode.left);
                    maxStack.push(currentDepth + 1);
                }
                if (currentNode.right != null) {
                    nodeStack.push(currentNode.right);
                    maxStack.push(currentDepth + 1);
                }

            }

        }
        return maxDepth;
    }
}