/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        Stack<Integer> stack = pushValToStack(head);
        return plusOneOperation(stack);
    }
    
    // GIVEN: the stack that has all the node's val
    // RETURNS: final result
    public ListNode plusOneOperation(Stack<Integer> stack) {
        ListNode dummy = new ListNode(0);
        int count = 0;
        int sum = 0;
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (count == 0) {
                sum = top + 1;
                dummy.val = sum % 10;
                ListNode newHead = new ListNode(sum / 10);
                newHead.next = dummy;
                dummy = newHead;
                count = count + 1;
            }
            else {
                sum = top + dummy.val;
                dummy.val = sum % 10;
                ListNode newHead = new ListNode(sum / 10);
                newHead.next = dummy;
                dummy = newHead;
            }
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
    
    // GIVEN: a linked list node
    // RETURNS: a stack that has all the elements on the list
    //          from head to tail
    public Stack<Integer> pushValToStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        return stack;
    }
}