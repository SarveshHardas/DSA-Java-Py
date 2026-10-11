/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = 0;

        while(curr != null){
            len++;
            curr = curr.next;
        }

        if(n == len){
            return head.next;
        }
        
        int idx = len - n + 1;
        curr = head;
        ListNode prev = null;
        
        for(int i = 1; i < idx; i++){
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        return head;
    }
}