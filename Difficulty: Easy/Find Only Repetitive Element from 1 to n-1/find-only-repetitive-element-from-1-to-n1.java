class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        HashMap<Integer,Integer> freq = new HashMap<>();
        int num = 0;
        for(int x: arr){
            freq.put(x,freq.getOrDefault(x,0) + 1);
            if(freq.get(x) > 1){
                num = x;
                break;
            }
        }
        
        return num;
    }
}