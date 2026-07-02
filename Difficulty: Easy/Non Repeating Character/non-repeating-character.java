class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> freq = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0) + 1);
        }
        
        for(char k: s.toCharArray()){
            if(freq.get(k) == 1){
                return k;
            }
        }
        
        return '$';
    }
}
