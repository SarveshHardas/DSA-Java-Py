class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && ch == stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}