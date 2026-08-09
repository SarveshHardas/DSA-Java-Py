class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1;
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                count++;
            } else if (nums[i + 1] - nums[i] == 0) {
                continue;
            } else {
                longest = Math.max(longest, count);
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}