/*
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		this.data = d;
		this.next = null;
	}
}
*/
class Solution {
	Node deleteNode(Node head, int x) {
		// code here
		Node temp = head;
		Node prev = temp;
		
		if (x == 1) {
			head = head.next;
		} else {
			
			while (temp != null && x > 1) {
				x -= 1;
				prev = temp;
				temp = temp.next;
			}
			
			prev.next = temp.next;
		}
		return head;
	}
}
