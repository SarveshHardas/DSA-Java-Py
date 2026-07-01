class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int n = st.size();
        for(int i = 0; i < n; i++){
            arr.add(st.pop());
        }
        
        Collections.sort(arr);
        
        for(int i = 0; i < n; i++){
            st.push(arr.get(i));
        }
    }
}