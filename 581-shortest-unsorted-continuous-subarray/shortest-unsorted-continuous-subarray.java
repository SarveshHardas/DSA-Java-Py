class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = -1;
        int right = -1;

        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);

            if (nums[i] < maxSoFar) {
                right = i;
            }
        }

        int minSoFar = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            minSoFar = Math.min(minSoFar, nums[i]);

            if (nums[i] > minSoFar) {
                left = i;
            }
        }

        if (left == -1) {
            return 0;
        }

        return right - left + 1;
    }
}