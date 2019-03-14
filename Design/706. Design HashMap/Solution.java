class MyHashMap {
    ListNode[] bucket;
    /** Initialize your data structure here. */
    public MyHashMap() {
        bucket = new ListNode[10000];
    }
    
    private int getHash(int x) {
        return x % bucket.length;
    }
    
    private ListNode findNodePrev(ListNode head, int key) {
        ListNode current = head;
        ListNode prev = null;
        
        while (current != null && current.key != key) {
            prev = current;
            current = current.next;
        }
        
        return prev;
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = getHash(key);
        ListNode head = bucket[index];
        if (head == null) {
            bucket[index] = new ListNode(-1, -1);
            head = bucket[index];
        }

        ListNode prev = findNodePrev(head, key);
        if (prev.next == null) {
            prev.next = new ListNode(key, value);
        }
        else {
            prev.next.val = value;
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getHash(key);
        ListNode head = bucket[index];
        if (head == null) {
            return -1;
        }
        ListNode prev = findNodePrev(head, key);

        if (prev.next == null) {
            return -1;
        }
        return prev.next.val;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getHash(key);
        ListNode head = bucket[index];
        if (head == null) {
            return;
        }
        ListNode prev = findNodePrev(head, key);
        if (prev.next == null) {
            return;
        }
        prev.next = prev.next.next;
    }
}

class ListNode {
    int key;
    int val;
    ListNode next;
    ListNode(int k, int x) {
        this.key = k;
        this.val = x;
        this.next = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */