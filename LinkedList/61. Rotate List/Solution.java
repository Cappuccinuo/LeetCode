/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int step = 0;
        while (temp != null) {
            temp = temp.next;
            step++;
        }
        if (k % step == 0) {
            return head;
        }
        k = k % step; 
        ListNode curr = head;
        for (int i = 1; i < step - k; i++) {
            curr = curr.next;
        }
        ListNode front = curr.next;
        curr.next = null;
        temp = front;
        for (int i = step - k + 1; i < step; i++) {
            temp = temp.next;
        }
        temp.next = head;
        return front;
    }
}