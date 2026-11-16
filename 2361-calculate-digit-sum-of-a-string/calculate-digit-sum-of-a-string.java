class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        }
        char[] s_arr = s.toCharArray();
        int n = s.length();
        StringBuilder s_new = new StringBuilder();
        for (int i = 0; i < n; i += k) {
            int j = i;
            int sum = 0;
            while (j < n && j < i + k) {
                sum += (int) s_arr[j++] - (int) '0';
            }
            s_new.append(sum);
        }

        String res = digitSum(s_new.toString(), k);

        return res.length() <= k ? res : "";
    }
}