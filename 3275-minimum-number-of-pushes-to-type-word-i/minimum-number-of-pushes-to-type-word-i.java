class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n <= 8){
            return n;
        }
        int quo = n / 8;
        int rem = n % 8;
        
        int ans = 8 * quo * (quo + 1) / 2 + (quo + 1) * rem;
        return ans;
    }
}