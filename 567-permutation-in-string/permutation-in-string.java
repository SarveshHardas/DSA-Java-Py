class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1_set = new int[26];
        int[] window = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1_set[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1_set,window)){
            return true;
        }
        
        int left = 0;
        for(int right = s1.length(); right < s2.length(); right++){
            window[s2.charAt(right) - 'a']++;
            window[s2.charAt(left) - 'a']--;
            left++;

            if(Arrays.equals(s1_set,window)){
                return true;
            }
        }
        return false;

    }
}