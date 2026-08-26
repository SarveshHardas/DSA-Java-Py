class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0;
        int count_one = 0;
        String best = "";

        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '1'){
                count_one++;
            }

            while(count_one == k){
                String current = s.substring(i,j+1);
                
                if(best.equals("") || current.length() < best.length() || (current.length() == best.length() && current.compareTo(best) < 0) ){
                    best = current;
                }

                if(s.charAt(i) == '1'){
                    count_one--;
                }
                i++;
            }
        }

        return best;
    }
}