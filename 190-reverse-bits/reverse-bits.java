class Solution {
    public int reverseBits(int n) {
        int i = 0;
        long ans = 0;
        while(i < 32 && n != 0){
            if(n % 2 == 1){
                ans += Math.pow(2,32-i-1);
            }
            i++;
            n = n / 2;
        }

        return (int) ans;
    }
}