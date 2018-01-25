/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode smallTail = small;
        ListNode largeTail = large;
        while (head != null) {
            if (head.val < x) {
                smallTail.next = head;
                smallTail = smallTail.next;
            }
            else {
                largeTail.next = head;
                largeTail = largeTail.next;
            }
            head = head.next;
        }
        smallTail.next = large.next;
        largeTail.next = null;
        return small.next;
    }
}