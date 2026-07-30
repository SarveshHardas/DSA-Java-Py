class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n <= 8){
            return n;
        }
        int quo = n / 8;
        int rem = n % 8;
        if(quo == 1){
            return 8 + (rem*2);
        }
        if(quo == 2){
            return 24 + (rem*3); 
        }
        if(quo == 3){
            return 48 + (rem*4);
        }

        return n;
    }
}