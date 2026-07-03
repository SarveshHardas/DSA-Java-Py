/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> postOrder(Node root) {
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
        solve(root.right);
        list.add(root.data);
    }
}