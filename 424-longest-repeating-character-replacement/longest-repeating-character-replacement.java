class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int i = 0;
        int maxFreq = 0;
        int best = 0;

        for (int j = 0; j < s.length(); j++) {
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(j)));

            while (j-i+1 - maxFreq > k){
                freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
                i++;
            }

            best = Math.max(best,j-i+1);
        }

        return best;
    }
}