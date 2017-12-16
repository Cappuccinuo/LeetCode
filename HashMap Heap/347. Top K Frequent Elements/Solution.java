class Solution {
    private Map<Integer, Integer> map = new HashMap<>();
    
    // GIVEN: a non-empty array of integers and a number k
    // RETURNS: k most frequent elements
    public List<Integer> topKFrequent(int[] nums, int k) {
        putNumToMap(nums);
        
        // Use the frequency to sort two integer
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (o1, o2) -> map.get(o1) - map.get(o2));
        putNumToPQ(pq, k);
        
        List<Integer> result = new ArrayList<>();
        getResultList(result, pq);
        return result;
    }
    
    // EFFECT: put all the nums into the hashmap, 
    //         key is the number
    //         value is the frequency of the number      
    public void putNumToMap(int[] nums) {
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
    
    // EFFECT: put the number into a priority queue, based on comparator
    //         mycomparator, the number with lower frequency is on the top
    //         once the priority queue's size exceed the k, we pop out the
    //         one with lower frequency
    public void putNumToPQ(PriorityQueue<Integer> pq, int k) {
        for (Integer i : map.keySet()) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
    }
    
    // EFFECT: pop out the number in priority queue, which is in frequency 
    //         ascending order, so we need to reverse the list to get the 
    //         most frequent elements
    public void getResultList(List<Integer> result, PriorityQueue<Integer> pq) {
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
    }
}