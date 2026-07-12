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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int lvl = q.size();
            double lvl_sum = 0;

            for(int i = 0; i < lvl; i++){
                TreeNode node = q.poll();
                lvl_sum += node.val;
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }

            double avg = lvl_sum / lvl;
            list.add(avg);
        }

        return list;
    }
}