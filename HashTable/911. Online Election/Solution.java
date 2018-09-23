class TopVotedCandidate {
    TreeMap<Integer, Integer> map;
    public TopVotedCandidate(int[] persons, int[] times) {
        map = new TreeMap<>();
        int N = persons.length;
        int[] count = new int[N];
        int max = 0;
        
        for (int i = 0; i < N; i++) {
            int p = persons[i];
            int t = times[i];
            count[p]++;
            if (count[p] >= max) {
                max = count[p];
                map.put(t, p);
            }
        }
    }
    
    public int q(int t) {
        int closeT = map.floorKey(t);
        return map.get(closeT);
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */