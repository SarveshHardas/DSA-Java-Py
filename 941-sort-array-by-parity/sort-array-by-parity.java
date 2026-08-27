class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        if(n < 2){
            return nums;
        }

        int[] ans = new int[n];
        int i = 0;
        for(int x: nums){
            if(x % 2 == 0){
                ans[i++] = x;
            }
        }

        for(int x: nums){
            if(x % 2 == 1){
                ans[i++] = x;
            }
        }

        return ans;
    }
}