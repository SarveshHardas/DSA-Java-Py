class Solution {
    public String decodeString(String s) {
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ']') {
                stack.push(String.valueOf(ch));
            } else {
                StringBuilder substr = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    substr.append(stack.pop());
                }
                stack.pop();
                StringBuilder k = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    k.append(stack.pop());
                }
                k.reverse();
                String decoded = substr.toString().repeat(Integer.parseInt(k.toString()));
                stack.push(decoded);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}