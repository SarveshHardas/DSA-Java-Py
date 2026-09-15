class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String op: operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(2 * stack.peek());
            }
            else if(op.equals("+")){
                int topElem = stack.pop();
                int secondTop = stack.peek();
                stack.push(topElem);
                stack.push(stack.peek() + secondTop);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }

        return res;
    }
}