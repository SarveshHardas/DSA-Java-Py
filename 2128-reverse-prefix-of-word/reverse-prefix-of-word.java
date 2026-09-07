class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        int left = 0;
        char[] charArr = word.toCharArray(); 
        while(left <= idx){
            char temp = charArr[left];
            charArr[left] = charArr[idx];
            charArr[idx] = temp;

            left++;
            idx--;
        }

        return new String(charArr);
    }
}