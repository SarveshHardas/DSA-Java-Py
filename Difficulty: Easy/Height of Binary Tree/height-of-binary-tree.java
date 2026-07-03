/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int count  = 0;

    public int height(Node root) {
        // code here
        int height = solve(root);
        return height;
    }
    
    int solve(Node root){
        if(root == null){
            return -1;
        }
        
        int heightLeft = solve(root.left);
        int heightRight = solve(root.right);
        
        return Math.max(heightLeft,heightRight) + 1;
    }
}