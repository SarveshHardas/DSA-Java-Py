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
    int min_diff = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        return min_diff;
    }

    void solve(TreeNode root){
        if(root == null){
            return ;
        }

        solve(root.left);
        if(prev != null){
            min_diff = Math.min(min_diff, root.val - prev.val);
        }
        prev = root;
        solve(root.right);
    }
}