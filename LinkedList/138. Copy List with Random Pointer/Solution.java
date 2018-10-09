/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode temp = head;
        while (temp != null) {
            map.put(temp, new RandomListNode(temp.label));
            temp = temp.next;
        }
        RandomListNode newNode;
        for (Map.Entry<RandomListNode, RandomListNode> entry : map.entrySet()) {
            newNode = entry.getValue();
            newNode.next = map.get(entry.getKey().next);
            newNode.random = map.get(entry.getKey().random);
        }
        return map.get(head);
    }
}


public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> nodes = new HashMap<>();
        RandomListNode current = head;
        while (current != null) {
            RandomListNode newNode = new RandomListNode(current.label);
            nodes.put(current, newNode);
            current = current.next;
        }
        
        current = head;
        while (current != null) {
            nodes.get(current).next = nodes.get(current.next);
            nodes.get(current).random = nodes.get(current.random);
            current = current.next;
        }
        return nodes.get(head);
    }
}

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> nodes = new HashMap<>();
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy;
        RandomListNode newNode;
        
        while (head != null) {
            if (nodes.containsKey(head)) {
                newNode = nodes.get(head);
            }
            else {
                newNode = new RandomListNode(head.label);
                nodes.put(head, newNode);
            }
            
            pre.next = newNode;
            
            if (head.random != null) {
                if (nodes.containsKey(head.random)) {
                    newNode.random = nodes.get(head.random);
                }
                else {
                    nodes.put(head.random, new RandomListNode(head.random.label));
                    newNode.random = nodes.get(head.random);
                }
            }
            
            pre = newNode;
            head = head.next;
        }
        
        return dummy.next;
    }
}