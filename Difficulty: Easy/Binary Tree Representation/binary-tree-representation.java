/*
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

import java.util.*;

class Solution {
    public Node buildTree(List<Integer> nodes) {
        // code here
        if(nodes == null || nodes.size() == 0)
            return null;
        
        Node root = new Node(nodes.get(0));
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        int i = 1;
        
        while(!q.isEmpty() && i < nodes.size()){
            Node curr = q.remove();
            
            if(i<nodes.size()){
                curr.left = new Node(nodes.get(i));
                q.add(curr.left);
                i++;
            }
            
            if(i<nodes.size()){
                curr.right = new Node(nodes.get(i));
                q.add(curr.right);
                i++;
            }
        }
        
        return root;
    }
}