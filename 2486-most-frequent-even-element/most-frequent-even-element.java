class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int mostFreqElem = -1;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                mostFreqElem = entry.getKey();
            }else if(entry.getValue() == maxValue){
                if(mostFreqElem > entry.getKey()){
                    maxValue = entry.getValue();
                    mostFreqElem = entry.getKey();
                }
            }
        }

        return mostFreqElem;
    }
}