/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count = 0;
        Node temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        if(k > count){
            return -1;
        }
        int idx = count - k;
        temp = head;
        while(idx > 0){
            temp = temp.next;
            idx -= 1;
        }
        
        return temp.data;
    }
}