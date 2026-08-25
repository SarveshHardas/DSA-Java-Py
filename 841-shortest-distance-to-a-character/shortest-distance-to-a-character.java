class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        Arrays.fill(ans, Integer.MAX_VALUE);

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == c){
                    ans[i] = Math.min(ans[i],Math.abs(i-j));
                }
            }
        }

        return ans;
    }
}