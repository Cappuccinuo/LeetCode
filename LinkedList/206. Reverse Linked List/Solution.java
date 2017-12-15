/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// Iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = dummy;
            dummy = temp;
            temp = nextNode;
        }
        return dummy;
    }
}

// Recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nextNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return nextNode;
    }
}