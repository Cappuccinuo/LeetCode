class MyLinkedList {
    ListNode dummy;
    ListNode tail;
    int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        dummy = new ListNode(-1);
        tail = dummy;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        
        ListNode current = dummy.next;
        int i;
        for (i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = dummy.next;
        dummy.next = node;
        size++;
        if (tail == dummy) {
            tail = node;
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);
        if (dummy.next == null) {
            dummy.next = newTail;
        }
        else {
            ListNode current = dummy.next;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTail;
        }
        tail = newTail;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        
        if (index == 0) {
            addAtHead(val);
        }
        else if (index == size) {
            addAtTail(val);
        }
        else {
            ListNode newNode = new ListNode(val);
            ListNode current = dummy.next;
            int i;
            for (i = 0; i < index - 1; i++) {
                current = current.next;
            }
            ListNode temp = current.next;
        
            current.next = newNode;
            newNode.next = temp;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        
        ListNode current = dummy;
        int i;
        for (i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (index == size) {
            tail = current;
        }
        size--;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
        this.next = null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */