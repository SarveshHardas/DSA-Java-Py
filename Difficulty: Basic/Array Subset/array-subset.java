class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        if(a.length < b.length){
            return false;
        }
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int i: a){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        
        for (int j : b) {
            if (freq.containsKey(j)) {
                int currentFreq = freq.get(j);
                
                if (currentFreq == 1) {
                    freq.remove(j);
                } else {
                    freq.put(j, currentFreq - 1);
                }
            }else{
                return false;
            }
        }
        
        return true;
    }
}
