class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_idx = -1;
        int max_idx = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                min_idx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                max_idx = i;
            }
        }

        System.out.println(min + " " + max);

        int from_left = Math.max(min_idx, max_idx) + 1;
        int from_right = n - Math.min(min_idx, max_idx);
        int from_both = (Math.min(min_idx, max_idx)) + (n - Math.max(min_idx, max_idx) + 1);

        int min_left_right = Math.min(from_left, from_right);

        System.out.println(from_left + " " + from_right + " " + from_both);

        return Math.min(min_left_right, from_both);
    }
}