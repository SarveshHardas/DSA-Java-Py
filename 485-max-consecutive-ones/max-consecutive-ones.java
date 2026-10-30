class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int best = 0;    
        
        for(int j = 0; j < n; j++){
            if(nums[j] == 0){
                best = Math.max(best, j - i);
                i = j+1;
            }
        }

        best = Math.max(best, n - i);
        return best;
    }
}