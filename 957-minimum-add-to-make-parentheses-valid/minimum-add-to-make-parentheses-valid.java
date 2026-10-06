class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }else{
                if(!stack.isEmpty() && c == ')' && stack.peek() == '(') {
                    stack.pop();
                }else if(stack.isEmpty() || stack.peek() == ')'){
                    stack.push(')');
                }
            }

        }

        return stack.size();
    }
}