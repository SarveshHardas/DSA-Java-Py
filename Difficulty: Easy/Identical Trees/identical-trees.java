/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // code here
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        
        solve(r1,list1);
        solve(r2,list2);
        
        return list1.equals(list2);
    }
    
    void solve(Node root, ArrayList<Character> list){
        if(root == null){
            list.add('N');
            return;
        }else{
            list.add((char)root.data);
        }
        solve(root.left, list);
        solve(root.right, list);
    }
}