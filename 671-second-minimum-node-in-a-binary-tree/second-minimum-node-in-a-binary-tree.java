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
    long min_elem = Long.MAX_VALUE;
    long min_elem2 = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        solve(root);
        if(min_elem2 == Float.POSITIVE_INFINITY){
            return -1;
        }
        return (int) min_elem2;
    }

    void solve(TreeNode root){
        if(root == null){
            return ;
        }

        if(root.val < min_elem){
            min_elem = root.val;
        }
        if(root.val <= min_elem2 && root.val > min_elem){
            min_elem2 = root.val;
        }

        solve(root.left);
        solve(root.right);
    }
}