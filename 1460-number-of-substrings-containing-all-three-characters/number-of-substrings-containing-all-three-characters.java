class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int i = 0;
        int ans = 0;
        int[] count = new int[3];

        for(int j = 0; j < n; j++){
            count[s.charAt(j) - 'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                ans += n-j;
                count[s.charAt(i) - 'a']--;
                i += 1;
            }
        }

        return ans;
    }
}