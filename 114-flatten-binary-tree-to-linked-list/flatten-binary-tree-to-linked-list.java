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
    public void flatten(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        preorder(root,stack);
        TreeNode prev = null;
        while(!stack.isEmpty()){
            TreeNode newNode = stack.pop();
            newNode.left = null;
            newNode.right = prev;

            prev = newNode;
        }
    }

    public static void preorder(TreeNode root, Deque<TreeNode> stack){
        if(root == null){
            return ;
        }

        stack.push(root);
        preorder(root.left,stack);
        preorder(root.right,stack);

        return ;
    }
}