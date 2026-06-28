class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int n = 0;
        for(int i = 2; i < nums.length; i += 2){
            if(nums[i-1] == nums[i]){
                n = nums[i - 2];
                break;
            }

            if(i+1 == nums.length){
                return nums[i];
            }
        }

        return  n;
    }
}