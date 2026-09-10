class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int best_pair_sum = 0;
        while( i < j){
            best_pair_sum = Math.max(best_pair_sum, nums[i] + nums[j]);
            i++;
            j--;
        }

        return best_pair_sum;
    }
}