class MyHashSet {
    ListNode[] bucket;
    /** Initialize your data structure here. */
    public MyHashSet() {
        bucket = new ListNode[10000];
    }
    
    private int getHash(int key) {
        return key % bucket.length;
    }
    
    private ListNode getNodePrev(ListNode head, int key) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null && current.key != key) {
            prev = current;
            current = current.next;
        }
        return prev;
    }
    
    public void add(int key) {
        int index = getHash(key);
        ListNode head = bucket[index];
        if (head == null) {
            bucket[index] = new ListNode(-1);
            head = bucket[index];
        }
        
        ListNode prev = getNodePrev(head, key);
        if (prev.next == null) {
            prev.next = new ListNode(key);
        }
    }
    
    public void remove(int key) {
        int index = getHash(key);
        ListNode head = bucket[index];
        if (head == null) {
            return;
        }
        
        ListNode prev = getNodePrev(head, key);
        if (prev.next == null) {
            return;
        }
        prev.next = prev.next.next;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = getHash(key);
        ListNode head = bucket[index];
        if (head == null) {
            return false;
        }
        ListNode prev = getNodePrev(head, key);
        if (prev.next == null) {
            return false;
        }
        return true;
    }
}

class ListNode {
    int key;
    ListNode next;
    ListNode(int x) {
        this.key = x;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */