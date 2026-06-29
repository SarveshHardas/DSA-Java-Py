/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        if(head == null){
            Node newNode = new Node(x);
            newNode.next = null;
            return newNode;
        }
        
        Node temp = head;
        Node prev = temp;
        while(temp != null){
            prev = temp;
            temp = temp.next;
        }
        
        Node newNode = new Node(x);
        prev.next = newNode;
        
        return head;
    }
}