class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int i = 0;
        for(String word: words){
            System.out.println(word);
            int left = 0;
            int right = word.length() - 1;
            char[] arr = word.toCharArray();
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            words[i++] = new String(arr);
        }
        return String.join(" ", words);
    }
}