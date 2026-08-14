class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int n = s.length();
        int i = 0;
        int best = 0;
        for (int j = 0; j < n; j++) {
            freq[(s.charAt(j) - 'a')]++;

            while (freq[s.charAt(j) - 'a'] > 2) {
                freq[(s.charAt(i) - 'a')]--;
                i++;
            }
            best = Math.max(best, j - i + 1);
        }

        return best;
    }
}