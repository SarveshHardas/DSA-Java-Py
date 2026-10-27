class Solution {
    public boolean isPalindrome(String s) {
        String mod = s.replace(" ","").toLowerCase();
        StringBuilder modS = new StringBuilder();

        for(int i = 0; i < mod.length(); i++){
            char ch = mod.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                modS.append(ch);
            }
        }
        
        System.out.println(modS);

        int i = 0; 
        int j = modS.length()-1;

        while(i < j){
            char left = modS.charAt(i);
            char right = modS.charAt(j);

            if(left != right){
                return false;
            }

            i++;
            j--;
        }


        return true;
    }
}