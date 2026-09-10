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
    public int count = 0;

    class Pair {
        int sum;
        int count;

        Pair(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    public int averageOfSubtree(TreeNode root) {
        calculateAvg(root);
        return count;
    }

    public Pair calculateAvg(TreeNode root) {
        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = calculateAvg(root.left);
        Pair right = calculateAvg(root.right);

        int tot = left.sum + right.sum + root.val;
        int childNum = left.count + right.count + 1;

        int avg = tot / childNum;

        if (avg == root.val) {
            count++;
        }

        return new Pair(tot, childNum);
    }
}