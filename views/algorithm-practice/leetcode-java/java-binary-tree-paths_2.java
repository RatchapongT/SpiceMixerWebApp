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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root != null) binaryTreePaths(root, "", result);
        return result;
    }

    private void binaryTreePaths(TreeNode currentNode, String path, List<String> result) {
        if (currentNode.left == null && currentNode.right == null) {
            result.add(path + currentNode.val);
        } else {
            if (currentNode.left != null) {
                binaryTreePaths(currentNode.left, path + currentNode.val + "->", result);
            }
            if (currentNode.right != null) {
                binaryTreePaths(currentNode.right, path + currentNode.val + "->", result);
            }
        }

    }
}