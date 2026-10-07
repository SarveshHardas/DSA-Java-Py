class Solution {
    Set<String> result = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int leftRemove = 0;
        int rightRemove = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                leftRemove++;
            } else if (ch == ')') {
                if (leftRemove > 0) {
                    leftRemove--;
                } else {
                    rightRemove++;
                }
            }
        }

        backtrack(s, 0, leftRemove, rightRemove, 0, new StringBuilder());

        return new ArrayList<>(result);
    }

    public void backtrack(String s, int index, int leftRemove, int rightRemove, int open,
            StringBuilder current) {
        if (index == s.length()) {
            if (leftRemove == 0 && rightRemove == 0 && open == 0) {
                result.add(current.toString());
            }
            return;
        }

        char ch = s.charAt(index);
        if (ch == '(' && leftRemove > 0) {
            backtrack(s, index + 1, leftRemove - 1, rightRemove, open, current);
        }

        if (ch == ')' && rightRemove > 0) {
            backtrack(s, index + 1, leftRemove, rightRemove - 1, open, current);
        }

        if (ch != '(' && ch != ')') {
            current.append(ch);
            backtrack(s, index + 1, leftRemove, rightRemove, open, current);
            current.deleteCharAt(current.length() - 1);
        } else if (ch == '(') {
            current.append(ch);
            backtrack(s, index + 1, leftRemove, rightRemove, open + 1, current);
            current.deleteCharAt(current.length() - 1);
        } else {
            if (open > 0) {
                current.append(ch);
                backtrack(s, index + 1, leftRemove, rightRemove, open - 1, current);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}