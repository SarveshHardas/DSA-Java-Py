/*
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}
}
*/

class Solution {
	ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> leftView(Node root) {
		// code here
		solve(root,0);
		
		return list;
	}
	
	void solve(Node root, int level) {
	    if(root == null){
	        return ;
	    }
	    
		if(list.size() == level){
		    list.add(root.data);
		}
		
		solve(root.left, level+1);
		solve(root.right, level+1);
	}
}
