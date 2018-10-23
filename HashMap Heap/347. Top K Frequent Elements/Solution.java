// Max Heap O(N + KlogN)
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
            public int compare(Integer i1, Integer i2) {
                return map.get(i2) - map.get(i1);
            }
        });
        for (int key : map.keySet()) {
            pq.offer(key);
        }
        while (k-- > 0) {
            result.add(pq.poll());
        }
        return result;
    }
}

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
// Min Heap O(N + NlogK)
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, (o1, o2) -> map.get(o1) - map.get(o2));
        for (int i : map.keySet()) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
// Bucket sort O(N)
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        for (int i = bucket.length - 1; i > 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }
        return result;
    }
}