class Solution {
    public int[] diStringMatch(String s) {
        int i = 0,j = 1;
        int n = s.length();

        int[] perm = new int[n+1];
        
        int least_curr = 0;
        int most_curr = n;
        
        
        for(int k = 0; k < s.length(); k++){
            char ch = s.charAt(k);
            if(ch == 'I'){
                perm[i] = least_curr;
                perm[j] = perm[i] + 1;

                least_curr += 1;
                i++;
                j++;
            }else{
                perm[i] = most_curr;
                perm[j] = perm[i] - 1;

                most_curr -= 1;
                i++;
                j++;
            }
        }

        return perm;
    }
}