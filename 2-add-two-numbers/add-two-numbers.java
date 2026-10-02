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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        int c = 0;
        ListNode prev = null;
        ListNode head = null;
        while (list1 != null && list2 != null) {
            int n = list1.val + list2.val + c;
            ListNode newNode = new ListNode(n % 10);
            c = n / 10;
            if (prev == null) {
                head = newNode;
                prev = head;
            } else {
                prev.next = newNode;
                prev = newNode;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        if(list1 == null && list2 != null){
            while(list2!=null){
                int n = list2.val + c;
                prev.next = new ListNode(n%10);
                c = n/10;
                list2 = list2.next;
                prev = prev.next;
            }
        }else{
            while(list1!=null){
                int n = list1.val + c;
                prev.next = new ListNode(n%10);
                c = n/10;
                list1 = list1.next;
                prev = prev.next;
            }
        }

        if(c != 0){
            prev.next = new ListNode(c);
        }

        return head;

    }
}