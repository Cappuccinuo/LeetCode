class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int[] sortedA = A.clone();
        Arrays.sort(sortedA);
        int[] sortedB = B.clone();
        Arrays.sort(sortedB);
        
        Map<Integer, Queue<Integer>> assigned = new HashMap<>();
        for (int b : sortedB) {
            assigned.put(b, new LinkedList<>());
        }
        
        Queue<Integer> remain = new LinkedList<>();
        
        int j = 0;
        for (int a : sortedA) {
            if (a > sortedB[j]) {
                assigned.get(sortedB[j]).add(a);
                j++;
            }
            else {
                remain.offer(a);
            }
        }
        
        int[] ans = new int[B.length];
        for (int i = 0; i < ans.length; i++) {
            if (assigned.get(B[i]).size() > 0) {
                ans[i] = assigned.get(B[i]).poll();
            }
            else {
                ans[i] = remain.poll();
            }
        }
        return ans;
    }
}