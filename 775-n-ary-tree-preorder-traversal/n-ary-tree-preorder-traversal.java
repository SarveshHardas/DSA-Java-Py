/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        solve(root,root.children,list);

        return list;    
    }

    void solve(Node root, List<Node> children, List<Integer> list){
        if( root == null ){
            return ;
        }
        list.add(root.val);
        for(Node x: children){
            solve(x, x.children, list);
        }
    }

}