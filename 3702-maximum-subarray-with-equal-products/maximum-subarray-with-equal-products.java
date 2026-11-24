class Solution {
    public int maxLength(int[] nums) {
        int i = 0;
        int prod = 1;
        int longest = 2;
        for(int j = 0; j < nums.length;j++){
            while(gcd(prod,nums[j]) > 1){
                prod = prod / nums[i];
                i++;
            }
            prod = prod * nums[j];
            longest = Math.max(longest,j-i+1);
        }
        return longest;
    }

    private int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a%b);  
    }
}