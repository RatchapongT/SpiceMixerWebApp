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
    List<String> result;

    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();
        binaryTreePaths(root, "");
        return result;
    }

    public void binaryTreePaths(TreeNode currentNode, String path) {
        if (currentNode != null) {
            if (path == "") {
                path = currentNode.val + "";
            } else {
                path = path + "->" + currentNode.val;
            }
            if (currentNode.left == null && currentNode.right == null) {
                result.add(path);
            } else {
                binaryTreePaths(currentNode.left, path);
                binaryTreePaths(currentNode.right, path);
            }

        }
    }
}