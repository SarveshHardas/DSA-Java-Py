import java.util.Stack;

class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> s = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            s.push(S.charAt(i));
        }
        
        StringBuilder rev = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            rev.append(s.pop());
        }
        
        return rev.toString();
    }
}