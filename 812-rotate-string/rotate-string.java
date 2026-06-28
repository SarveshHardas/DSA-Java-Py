class Solution {
    public boolean rotateString(String s, String goal) {
        String dbl_str = s + s;
        if(dbl_str.contains(goal)){
            return true;
        }

        return false;
    }
}