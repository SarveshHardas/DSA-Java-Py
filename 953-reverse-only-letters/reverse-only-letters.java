class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;

        if(s.length() < 2){
            return s;
        }

        char[] s_arr = s.toCharArray();

        while (i <= j) {
            if (Character.isLetter(s_arr[i]) && Character.isLetter(s_arr[j])) {
                char temp = s_arr[i];
                s_arr[i] = s_arr[j];
                s_arr[j] = temp;
                i++;
                j--;
            }
            if (!Character.isLetter(s_arr[i])) {
                i++;
            }
            if (!Character.isLetter(s_arr[j])) {
                j--;
            }
        }

        return new String(s_arr);
    }
}