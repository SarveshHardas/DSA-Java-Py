class Solution {
    public boolean checkString(String s) {
        boolean b_start = false;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'b' && b_start == false){
                b_start = true;
            }

            if(b_start == true && ch == 'a'){
                return false;
            }   
        }

        return true;
    }
}