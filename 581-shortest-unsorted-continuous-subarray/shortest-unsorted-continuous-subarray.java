class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = -1;
        int right = -1;

        int maxSoFar = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            maxSoFar = Math.max(maxSoFar, nums[i]);

            if(nums[i] < maxSoFar){
                right = i;
            }
        }

        int minSoFar = Integer.MAX_VALUE;
        for(int j = nums.length - 1; j >= 0; j--){
            minSoFar = Math.min(minSoFar, nums[j]);

            if(nums[j] > minSoFar){
                left = j;
            }
        }

        if(left == -1){
            return 0;
        }

        return right - left + 1;
    }
}