class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] ans = new int[k];

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Map<Integer, Integer> sorted = freq.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) 
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        
        int i = 0;
        for(int key: sorted.keySet()){
            if(i >= k){
                break;
            }
            ans[i] = key;
            i++;
        }

        return ans;
    }
}