class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();

        for (int x = 0; x < t.length(); x++) {
            need.put(t.charAt(x), need.getOrDefault(t.charAt(x), 0) + 1);
        }

        int req = t.length();
        int have = 0;
        int left = 0;

        int bestStart = 0;
        int bestLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            if (need.containsKey(s.charAt(right))) {
                need.put(s.charAt(right), need.get(s.charAt(right)) - 1);
                if (need.get(s.charAt(right)) >= 0) {
                    have++;
                }
            }
            while (have == req){
                if(right - left + 1 < bestLength){
                    bestLength = right - left + 1;
                    bestStart = left;
                }

                if(need.containsKey(s.charAt(left))){
                    if(need.get(s.charAt(left)) >= 0){
                        have--;
                    }
                    need.put(s.charAt(left),need.get(s.charAt(left)) + 1);
                }

                left++;
            }
        }
        if(bestLength == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(bestStart, bestStart+bestLength);
    }
}