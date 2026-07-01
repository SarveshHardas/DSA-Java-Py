class Solution {
    public int titleToNumber(String columnTitle) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        if(columnTitle.length() == 1){
            return s.indexOf(columnTitle) + 1;
        }
        int num = 0;
        int n = columnTitle.length();
        for(int i = 0; i < columnTitle.length(); i++){
            int dig = s.indexOf(columnTitle.charAt(i)) + 1;
            num = num  * 26 + dig;
        }

        return num;
    }
}