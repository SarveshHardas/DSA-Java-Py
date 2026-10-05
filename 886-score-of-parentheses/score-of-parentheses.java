class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int dep = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                dep++;
            }else{
                dep--;
                if(i > 0 && s.charAt(i-1) == '('){
                    score += Math.pow(2,dep);
                }
            }
        }

        return score;
    }
}