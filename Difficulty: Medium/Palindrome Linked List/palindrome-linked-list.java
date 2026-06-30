/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node prev = null;
        Node slow = head;
        Node fast = head;
        Node nxt = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            nxt = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nxt;
        }
        if(fast != null){
            slow = slow.next;
        }
        
        while(prev != null){
            if(slow.data != prev.data){
                return false;
            }
            
            slow = slow.next;
            prev = prev.next;
        }
        
        return true;
    }
}