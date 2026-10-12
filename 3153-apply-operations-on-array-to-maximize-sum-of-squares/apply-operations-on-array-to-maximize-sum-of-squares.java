class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] count = new int[31];
        int mod = 1000000007;

        for(int num: nums){
            for(int i = 0; i < 31; i++){
                if((num & (1 << i)) != 0){
                    count[i]++;
                }
            }
        }

        long ans = 0;

        for(int i = 0; i < k; i++){
            long num = 0;
            for(int bit = 0; bit < 31; bit++){
                if(count[bit] > 0){
                    num |= (1L << bit);
                    count[bit]--;
                }
            }

            ans = (ans + num*num) % mod;
        }


        return (int)ans;
    }
}