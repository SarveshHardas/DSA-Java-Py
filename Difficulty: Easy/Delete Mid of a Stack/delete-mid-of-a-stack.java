class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        while(s.size() != st.size() && s.size() - st.size() != 1){
            st.push(s.pop());
        }
        s.pop();
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    }
}