/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (p != null) {
            s1.push(p.val);
            p = p.next;
        }
        while (q != null) {
            s2.push(q.val);
            q = q.next;
        }
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int x = (!s1.isEmpty()) ? s1.pop() : 0;
            int y = (!s2.isEmpty()) ? s2.pop() : 0;
            int sum = x + y + dummy.val;
            
            dummy.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = dummy;
            dummy = head;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
}