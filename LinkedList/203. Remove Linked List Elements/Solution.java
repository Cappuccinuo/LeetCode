/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode current = dummy;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                while (current.next != null && current.next.val == val) {
                    current = current.next;
                }
                temp.next = current.next;
            }
            current = current.next;
            temp = current;
        }
        return dummy.next;
    }
}