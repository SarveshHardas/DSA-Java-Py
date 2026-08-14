class Solution {
    public int maximumLengthSubstring(String s) {
        // int[] freq = new int[26];
        HashMap<Character,Integer> freq = new HashMap<>();
        int n = s.length();
        int i = 0;
        int best = 0;
        for (int j = 0; j < n; j++) {
            freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);

            while (freq.get(s.charAt(j)) > 2) {
                freq.put(s.charAt(i),freq.get(s.charAt(i)) - 1);
                i++;
            }
            best = Math.max(best, j - i + 1);
        }

        return best;
    }
}