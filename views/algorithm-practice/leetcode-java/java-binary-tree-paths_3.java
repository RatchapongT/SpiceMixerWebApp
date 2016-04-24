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

        List<String> results = new LinkedList<>();

        if (root == null) return results;

        if (root.left == null && root.right == null) {
            results.add(root.val + "");
            return results;
        }

        for (String path : binaryTreePaths(root.left)) {
            results.add(root.val + "->" + path);
        }

        for (String path : binaryTreePaths(root.right)) {
            results.add(root.val + "->" + path);
        }

        return results;

    }
}