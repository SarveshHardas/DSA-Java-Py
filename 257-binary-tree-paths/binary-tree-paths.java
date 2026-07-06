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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        solve(root,"");
        return list;
    }

    void solve(TreeNode root, String path){
        if(root == null){
            return;
        }

        if(root.right == null && root.left == null){
            path = path + root.val;
            list.add(path);
            return ;
        }

        path = path + root.val;
        path = path + "->";
        solve(root.left,path);
        solve(root.right,path);
    }
}