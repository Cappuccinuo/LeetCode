class LRUCache {
    int capacity;
    int currentSize;
    Map<Integer, ListNode> mapToPrev;
    ListNode dummy;
    ListNode tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.mapToPrev = new HashMap<>();
        this.dummy = new ListNode(0, 0);
        this.tail = this.dummy;
    }
    
    private void moveToTail(int key) {
        ListNode prev = mapToPrev.get(key);
        ListNode curt = prev.next;
        if (curt == tail) {
            return;
        }
        
        prev.next = prev.next.next;
        tail.next = curt;
        
        if (prev.next != null) {
            mapToPrev.put(prev.next.key, prev);
        }
        mapToPrev.put(curt.key, tail);
        tail = curt;
    }
    
    public int get(int key) {
        if (!mapToPrev.containsKey(key)) {
            return -1;
        }
        
        moveToTail(key);
        
        return tail.val;
    }
    
    public void put(int key, int value) {
        if (get(key) != -1) {
            ListNode prev = mapToPrev.get(key);
            prev.next.val = value;
            return;
        }
        
        if (currentSize < capacity) {
            currentSize++;
            ListNode current = new ListNode(key, value);
            tail.next = current;
            mapToPrev.put(key, tail);
            tail = current;
            return;
        }
        
        ListNode first = dummy.next;
        mapToPrev.remove(first.key);
        
        first.key = key;
        first.val = value;
        
        mapToPrev.put(key, dummy);
        moveToTail(key);
    }
}

class ListNode {
    int key;
    int val;
    ListNode next;
    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */