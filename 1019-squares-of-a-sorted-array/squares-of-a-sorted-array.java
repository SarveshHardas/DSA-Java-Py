class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        for (int k = 0; k < n; k++) {
            nums[k] = nums[k] * nums[k];
        }
        Arrays.sort(nums);
        return nums;
    }
}