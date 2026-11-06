class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        
        if(n == 0){
            return -1;
        }

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        for(int i = 0 ; i < h+1-n; i++){
            for(int j = 0; j < n; j++){
                if(haystackArr[i+j] != needleArr[j]){
                    break;
                }
                if(j == n - 1){
                    return i;
                }
            }
        }

        return -1;
    }
}