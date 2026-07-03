/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        list.clear();
        solve(root);
        return list;
    }
    
    void solve(Node root){
        if(root == null){
            return ;
        }
        
        solve(root.left);
        list.add(root.data);
        solve(root.right);
    }
}