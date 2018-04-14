/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (headA == headB) {
            return headA;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        int stepA = 1;
        int stepB = 1;
        while (tempA.next != null) {
            stepA++;
            tempA = tempA.next;
        }
        while (tempB.next != null) {
            stepB++;
            tempB = tempB.next;
        }
        if (tempA != tempB) {
            return null;
        }
        tempA = headA;
        tempB = headB;
        if (stepA < stepB) {
            while (stepA < stepB) {
                tempB = tempB.next;
                stepB--;
            }
        }
        if (stepA > stepB) {
            while (stepA > stepB) {
                tempA = tempA.next;
                stepA--;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}