class Solution {
    public int minRemove(int[] arr1, int[] arr2) {
        // code here
        HashMap<Integer,Integer> set_arr1 = new HashMap<>();
        HashMap<Integer,Integer> set_arr2 = new HashMap<>();
        int count = 0;
        // countA.put(num, countA.getOrDefault(num, 0) + 1);
        for(int i : arr1){
            set_arr1.put(i,set_arr1.getOrDefault(i,0) + 1);
        }
        
        for(int j : arr2){
            set_arr2.put(j,set_arr2.getOrDefault(j,0) + 1);
        }
        
        for(int k: set_arr1.keySet()){
            if(set_arr2.containsKey(k)){
                count += Math.min(set_arr1.get(k), set_arr2.get(k));
            }
        }
        
        return count;
    }
}
