// 2018.5.3
class Solution {
    public boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();
        if (!constructGraph(org, seqs, graph, inDegree)) {
            return false;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int key : inDegree.keySet()) {
            if (inDegree.get(key) == 0) {
                queue.offer(key);
            }
        }
        
        int count = 0;
        while (queue.size() == 1) {
            int first = queue.poll();
            for (int next : graph.get(first)) {
                inDegree.put(next, inDegree.get(next) - 1);
                if (inDegree.get(next) == 0) {
                    queue.offer(next);
                }
            }
            
            if (first != org[count]) {
                return false;
            }
            
            count++;
        }
        
        return count == org.length;
    }
    
    private boolean constructGraph(int[] org,
                                List<List<Integer>> seqs, 
                                Map<Integer, Set<Integer>> graph, 
                                Map<Integer, Integer> inDegree) {
        for (int num : org) {
            graph.put(num, new HashSet());
            inDegree.put(num, 0);
        }
        
        int n = org.length;
        int count = 0;
        
        for (List<Integer> seq : seqs) {
            count += seq.size();
            if (seq.size() > 0 && (seq.get(0) <= 0 || seq.get(0) > n)) {
                return false;
            }
            for (int i = 1; i < seq.size(); i++) {
                if (seq.get(i) <= 0 || seq.get(i) > n) {
                    return false;
                }
                if (graph.get(seq.get(i - 1)).add(seq.get(i))) {
                    inDegree.put(seq.get(i), inDegree.get(seq.get(i)) + 1);
                }
            }
        }
        
        if (count < n) {
            return false;
        }
        return true;
    }
}