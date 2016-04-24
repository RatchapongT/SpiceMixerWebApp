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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pTree = new Stack<>();
        Stack<TreeNode> qTree = new Stack<>();
        if (p != null) pTree.push(p);
        if (q != null) qTree.push(q);
        while (!pTree.empty() && !qTree.empty()) {
            p = pTree.pop();
            q = qTree.pop();
            if (p.val != q.val) return false;
            if (p.left != null) pTree.push(p.left);
            if (q.left != null) qTree.push(q.left);
            if (pTree.size() != qTree.size()) return false;
            if (p.right != null) pTree.push(p.right);
            if (q.right != null) qTree.push(q.right);
            if (pTree.size() != qTree.size()) return false;
        }
        return pTree.size() == qTree.size();
    }
}
