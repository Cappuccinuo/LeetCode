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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeNine = dummy;
        ListNode lastNode = dummy;
        
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            if (lastNode.val != 9) {
                beforeNine = lastNode;
            }
        }
        
        if (lastNode.val != 9) {
            lastNode.val = lastNode.val + 1;
        }
        else {
            beforeNine.val = beforeNine.val + 1;
            while (beforeNine != lastNode) {
                beforeNine = beforeNine.next;
                beforeNine.val = 0;
            }
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }
}

class Solution {
    public ListNode plusOne(ListNode head) {
        head = reverseList(head);
        ListNode curr = head;
        int carry = 1;
        while (curr.next != null) {
            int sum = curr.val + carry;
            curr.val = sum % 10;
            carry = sum / 10;
            curr = curr.next;
        }
        if (carry != 0) {
            int sum = curr.val + carry;
            ListNode temp = new ListNode(sum / 10);
            curr.val = sum % 10;
            if (temp.val != 0) {
                curr.next = temp;
            }
        }
        return reverseList(head);
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}


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