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
import java.util.*;
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        int min_diff = Integer.MAX_VALUE;
        Collections.sort(list);
        for(int i = 0; i<list.size()-1;i++){
            if(Math.abs(list.get(i) - list.get(i+1)) < min_diff){
                min_diff = Math.abs(list.get(i) - list.get(i+1));
            }
        }

        return min_diff;
    }

    void solve(TreeNode root){
        if(root == null){
            return;
        }

        list.add(root.val);
        solve(root.left);
        solve(root.right);
    }
}