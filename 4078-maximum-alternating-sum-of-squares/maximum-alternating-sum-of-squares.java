class Solution {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        long sum = 0;
        int mid = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            if (i < mid) {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }
        }

        return (long) sum;
    }
}