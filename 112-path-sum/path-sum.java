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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        // if(targetSum < root.val){
        //     return false;
        // }
        return solve(root,0,targetSum);
    }

    boolean solve(TreeNode root, int prevSum, int targetSum){
        if(root == null){
            return false;
        }

        prevSum += root.val;
        // if(prevSum > targetSum){
        //     prevSum -= root.val;
        // }
        if(prevSum == targetSum && root.left == null && root.right == null){
            return true;
        }

        boolean leftSum = solve(root.left,prevSum,targetSum);
        boolean rightSum = solve(root.right,prevSum,targetSum);

        return leftSum || rightSum;
    }
}