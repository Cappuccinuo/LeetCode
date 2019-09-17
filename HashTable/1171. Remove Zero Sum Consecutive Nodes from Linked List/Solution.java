/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0, dummy);
        int sum = 0;
        ListNode current = head;
        while (current != null) {
            sum += current.val;
            if (map.containsKey(sum)) {
                ListNode front = map.get(sum);
                ListNode temp = front.next;
                int val = sum;
                while (temp != current) {
                    val += temp.val;
                    map.remove(val);
                    temp = temp.next;
                }
                front.next = current.next;
            }
            else {
                map.put(sum, current);
            }
            
            current = current.next;
        }
        
        return dummy.next;
    }
}