class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        long maxProd = nums[0];
        for (int start = 0; start < n; start++) {
            long currProd = 1;
            for (int end = start; end < n; end++) {
                currProd *= nums[end];
                if (currProd > maxProd) {
                    maxProd = currProd;
                }
            }
        }

        return (int)maxProd;
    }
}
