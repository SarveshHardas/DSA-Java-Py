class Solution {
    public int removeDuplicates(int[] nums) {
        int replaces = 1;
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i-1] != nums[i]){
                nums[replaces] = nums[i];
                replaces++;
            }
        }

        return replaces;
    }
}