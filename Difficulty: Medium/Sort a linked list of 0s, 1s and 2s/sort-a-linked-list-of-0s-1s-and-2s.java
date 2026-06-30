/*
class Node {
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class Solution {
	public Node segregate(Node head) {
		// code here
	    Node temp = head;
        
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        
        while(temp != null){
            if(temp.data == 0){
                count_0++;
            }else if(temp.data == 1){
                count_1++;
            }else{
                count_2++;
            }
            temp = temp.next;
        }
        Node newlist = new Node(0);
        Node newhead = newlist;
        Node prev = newhead;
        temp = head;
        
        for(int i = 0; i < count_0; i++){
            if(i == 0){
                continue;
            }
            else{
                Node newnode = new Node(0);
                prev.next = newnode;
                prev = prev.next;
            }
        }
        for(int j = 0; j < count_1; j++){
            if(count_0 == 0 && newlist.data != 1){
                newlist.data = 1;
            }
            else{
                Node newnode = new Node(1);
                prev.next = newnode;
                prev = prev.next;
            }
        }
        for(int k = 0; k < count_2; k++){
            if(count_1 == 0 && count_0 == 0 && newlist.data != 2){
                newlist.data = 2;
            }
            else{
                Node newnode = new Node(2);
                prev.next = newnode;
                prev = prev.next;
            }
        }
        return newhead;
	}
}
