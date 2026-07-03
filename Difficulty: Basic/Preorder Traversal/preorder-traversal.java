/*
class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
*/

class Solution {
	ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> preOrder(Node root) {
		list.clear();
		solve(root);
		return list;
	}
	
	void solve(Node root) {
		if (root == null)
			return;
		
		list.add(root.data);
		solve(root.left);
		solve(root.right);
	}
}
