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
    public void reorderList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next;
        slow.next = null;

        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        curr = head;

        while(!stack.isEmpty()){
            ListNode insertedNode = stack.pop();

            ListNode temp = curr.next;
            curr.next = insertedNode;
            insertedNode.next = temp;
            
            curr = temp;
        }
    }
}