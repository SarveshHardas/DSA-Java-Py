/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ref;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        solve(cloned, target);
        return ref;
    }

    void solve(TreeNode root, TreeNode target) {
        if (root == null) {
            return;
        }
        if (root.val == target.val ) {
            ref = root;
            return;
        }

        solve(root.left, target);
        solve(root.right, target);

        return;
    }
}