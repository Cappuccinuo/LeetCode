/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode prev = null;
        ListNode front = null;
        ListNode tail = null;
        for (int i = 1; i < m; i++) {
            curr = curr.next;
        }
        prev = curr;
        curr = prev.next;
        tail = curr;
        for (int i = m; i <= n; i++) {
            ListNode nextNode = curr.next;
            curr.next = front;
            front = curr;
            curr = nextNode;
        }
        tail.next = curr;
        prev.next = front;
        return dummy.next;
    }
}