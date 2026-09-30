class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        Deque<Character> stack = new ArrayDeque<>();
        int[] ans = new int[seq.length()];

        for(int i = 0; i < seq.length(); i++){
            char ch = seq.charAt(i);
            if( ch == '(' ){
                ans[i] = stack.size()%2;
                stack.push(ch);
            }else{
                ans[i] = (stack.size() - 1) % 2;
                stack.pop();
            }
        }

        return ans;
    }
}