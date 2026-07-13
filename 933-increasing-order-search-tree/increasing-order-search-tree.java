/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        return solve(root,null);
    }

    static TreeNode solve(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = solve(root.left, root);
        root.left = null;
        root.right = solve(root.right, tail);
        return res;
    }
}