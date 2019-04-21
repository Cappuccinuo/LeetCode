class RandomizedCollection {
    Random rand;
    Map<Integer, Set<Integer>> map;
    List<Integer> list;
    
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        rand = new Random();
        map = new HashMap<>();
        list = new LinkedList<>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        boolean contains = true;
        if (!map.containsKey(val)) {
            map.put(val, new LinkedHashSet());
            contains = false;
        }
        map.get(val).add(list.size());
        list.add(val);
        return !contains;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int size = map.get(val).iterator().next();
        map.get(val).remove(size);
        if (map.get(val).size() == 0) {
            map.remove(val);
        }
        
        if (size < list.size() - 1) {
            int last = list.get(list.size() - 1);
            list.set(size, last);
            map.get(last).remove(list.size() - 1);
            map.get(last).add(size);
        }
        
        list.remove(list.size() - 1);
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */