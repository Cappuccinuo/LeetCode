/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        if (head.val == head.next.val && head.next.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode current = head.next;
        while (current.next != null) {
            if (slow.val == current.next.val) {
                if (current.next.next != null) {
                    return false;
                }
                current.next = null;
                slow = slow.next;
                current = slow.next;
                if (current == null || slow.val == current.val) {
                    return true;
                }
            }
            else {
                current = current.next;
            }
        }
        return false;
    }
}