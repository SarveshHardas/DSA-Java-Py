
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode newHead = head.next;
        ListNode prev = null;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;

            curr.next = next.next;
            next.next = curr;

            if (prev != null) {
                prev.next = next;
            }

            prev = curr;
            curr = curr.next;
        }

        return newHead;
    }
}
