class Solution {
    public String largestOddNumber(String num) {
        int idx = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            int n = (int) num.charAt(i) - (int) '0';
            if (n % 2 == 1) {
                idx = i;
                break;
            }
        }
        StringBuilder max_odd = new StringBuilder();
        if (((int) num.charAt(idx) - (int) '0') % 2 == 1) {
            for (int i = 0; i <= idx; i++) {
                max_odd.append(num.charAt(i));
            }
        }
        return max_odd.toString();
    }
}