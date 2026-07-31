class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c: word.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0) + 1);
        }

        HashMap<Character, Integer> sortedFreq = freq.entrySet().stream().sorted(Map.Entry.<Character,Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        int ans = 0;
        int idx = 0;
        for(Map.Entry<Character,Integer> entry: sortedFreq.entrySet()){
            int occ = entry.getValue();
            int groupPos = (idx / 8) + 1;

            ans += occ * groupPos;
            idx++;
        }
        return ans;
    }
}