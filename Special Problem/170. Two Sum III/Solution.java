class TwoSum {
    HashMap<Integer, Integer> map;
    /** Initialize your data structure here. */
    public TwoSum() {
        this.map = new HashMap<Integer, Integer>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (int i : map.keySet()) {
            int remain = value - i;
            if (remain == i) {
                if (map.get(i) >= 2) {
                    return true;
                }
            }
            else {
                if (map.containsKey(remain)) {
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */