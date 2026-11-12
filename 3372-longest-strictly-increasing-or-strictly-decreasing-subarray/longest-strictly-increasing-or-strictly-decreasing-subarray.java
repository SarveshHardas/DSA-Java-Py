class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc_best = 1;
        int des_best = 1;
        int best = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                des_best++;
            }else{
                des_best = 1;
            } 

            if(nums[i-1] < nums[i]){
                inc_best++;
            }else{
                inc_best = 1;
            }

            best = Math.max(best,Math.max(inc_best,des_best));
        }

        return best;
    }
}