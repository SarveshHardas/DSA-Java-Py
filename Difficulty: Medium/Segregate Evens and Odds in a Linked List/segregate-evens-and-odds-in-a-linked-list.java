/* Structure of a link list node
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
    Node divide(Node head) {
        // code here
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                break;
            }
            temp = temp.next;
        }
        Node newList = new Node(temp.data);
        Node newhead = newList;
        Node prev = newhead;
        while(temp != null){
            if(temp.data % 2 == 0){
                Node newnode = new Node(temp.data);
                prev.next = newnode;
                prev = newnode;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data % 2 == 1){
                Node newnode = new Node(temp.data);
                prev.next = newnode;
                prev = newnode;
            }
            temp = temp.next;
        }
        
        return newhead.next;
    }
}