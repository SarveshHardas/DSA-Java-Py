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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int max_freq = Integer.MIN_VALUE;

        solve(root, freq);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int curr_freq = entry.getValue();
            if (curr_freq > max_freq) {
                max_freq = curr_freq;
                list.clear();
                list.add(entry.getKey());
            } else if (max_freq == curr_freq) {
                list.add(entry.getKey());
            }
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;

    }

    void solve(TreeNode root, HashMap<Integer, Integer> freq) {
        if (root == null) {
            return;
        }

        freq.put(root.val, freq.getOrDefault(root.val, 0) + 1);
        solve(root.left, freq);
        solve(root.right, freq);
    }
}