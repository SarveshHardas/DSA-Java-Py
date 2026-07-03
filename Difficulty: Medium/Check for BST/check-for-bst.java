/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public boolean isBST(Node root) {
        // code here
        inOrder(root);
        
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        
        return true;
    }
    
    void inOrder(Node root){
        if(root == null){
            return ;
        }
        
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }
}