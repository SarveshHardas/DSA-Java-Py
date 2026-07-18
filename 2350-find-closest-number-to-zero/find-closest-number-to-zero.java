class Solution {
    public int findClosestNumber(int[] nums) {
        int min_elem = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(Math.abs(nums[i]) < Math.abs(min_elem)){
                min_elem = nums[i];
            }
            else if(Math.abs(nums[i]) == Math.abs(min_elem) && nums[i] > 0){
                min_elem = nums[i];
            }
        }

        return min_elem;
    }
}