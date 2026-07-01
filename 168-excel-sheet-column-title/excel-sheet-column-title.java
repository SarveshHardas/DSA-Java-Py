class Solution {
    public String convertToTitle(int columnNumber) {
        String s = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder ans = new StringBuilder();

        if (columnNumber <= 26) {
            return String.valueOf(s.charAt(columnNumber));
        }

        int num = columnNumber;

        while (num != 0) {
            int dig = num % 26;
            num = (int) num / 26;
            if (dig == 0) {
                num -= 1;
            }
            ans.append(s.charAt(dig));
            if (num <= 26) {
                ans.append(s.charAt(num));
                break;
            }
        }

        ans.reverse();
        return ans.toString();
    }
}