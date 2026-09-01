class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        int[] ans = new int[n];

        for (int k = 0; k < n; k++) {
            nums[k] = nums[k] * nums[k];
        }

        int l = n - 1;

        while (i <= j) {
            if (nums[i] >= nums[j]) {
                ans[l--] = nums[i];
                i++;
            } else {
                ans[l--] = nums[j];
                j--;
            }
        }

        return ans;
    }
}