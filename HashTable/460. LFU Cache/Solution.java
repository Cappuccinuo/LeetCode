class LFUCache {
    Map<Integer, Integer> vals;
    Map<Integer, Integer> counts;
    Map<Integer, LinkedHashSet<Integer>> list;
    int capacity;
    int size;
    int min;
    
    public LFUCache(int capacity) {
        this.vals = new HashMap<>();
        this.counts = new HashMap<>();
        this.list = new HashMap<>();
        this.capacity = capacity;
        this.size = 0;
        this.min = -1;
    }
    
    public int get(int key) {
        if (!vals.containsKey(key)) {
            return -1;
        }
        int count = counts.get(key);
        counts.put(key, count + 1);
        list.get(count).remove(key);
        if (list.get(count).size() == 0) {
            if (count == min) {
                min = count + 1;
            }
        }
        if (!list.containsKey(count + 1)) {
            list.put(count + 1, new LinkedHashSet());
        }
        list.get(count + 1).add(key);
        return vals.get(key);
    }
    
    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        if (!vals.containsKey(key)) {
            if (size < capacity) {
                size++;
            }
            else {
                int delete = list.get(min).iterator().next();
                vals.remove(delete);
                list.get(min).remove(delete);
            }
            vals.put(key, value);
            counts.put(key, 1);
            min = 1;
            if (!list.containsKey(1)) {
                list.put(1, new LinkedHashSet());
            }
            list.get(1).add(key);
        }
        else {
            vals.put(key, value);
            get(key);
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */