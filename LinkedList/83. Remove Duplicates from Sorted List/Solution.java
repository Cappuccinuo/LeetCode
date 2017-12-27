/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current.next != null && current != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }
}