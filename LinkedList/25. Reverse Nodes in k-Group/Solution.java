/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy;
        ListNode prev = dummy;
        ListNode temp;
        
        while (true) {
            int count = k;
            while (count-- > 0 && tail != null) {
                tail = tail.next;
            }
            if (tail == null) {
                break;
            }
            head = prev.next;
            while (prev.next != tail) {
                temp = prev.next;
                prev.next = temp.next;
                
                temp.next = tail.next;
                tail.next = temp;
            }
            prev = head;
            tail = head;
        }
        
        return dummy.next;
    }
}