class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int dig_sum = 0;
        int dig_prod = 1;
        while(temp != 0){
            int dig = temp%10;
            dig_sum += dig;
            dig_prod *= dig;
            temp /= 10; 
        }
        return n % (dig_sum+dig_prod) == 0;
    }
}