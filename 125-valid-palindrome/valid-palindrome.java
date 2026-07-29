class Solution {
    public boolean isPalindrome(String s) {
        String modified = s.replace(" ", "").toLowerCase();
        if (s == "") {
            return true;
        }

        StringBuilder charArray = new StringBuilder(modified);

        for (int i = 0; i < charArray.length(); i++) {
            if (!Character.isLetterOrDigit(charArray.charAt(i))){
                charArray.deleteCharAt(i);
                i--;
            }
        }

        if(charArray.length() < 2){
            return true;
        }

        int left = 0;
        int right = charArray.length() - 1;
        while(left <= right){
            if(charArray.charAt(left) != charArray.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}