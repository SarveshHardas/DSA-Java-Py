/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        Node temp = head;
        while(temp != null && index > 1){
            temp = temp.next;
            index -= 1;
        }
        if(temp == null){
            return -1;
        }
        return temp.data;
    }
}