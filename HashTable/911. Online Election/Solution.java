class TopVotedCandidate {
    int[][] result;
    public TopVotedCandidate(int[] persons, int[] times) {
        int len = persons.length;
        result = new int[len][2];
        int i;
        
        int max = 0;
        int p = -1;
        
        int[] map = new int[len];
        
        for (i = 0; i < len; i++) {
            int person = persons[i];
            int time = times[i];
            map[person]++;
            if (map[person] >= max) {
                max = map[person];
                p = person;
            }
            result[i][0] = time;
            result[i][1] = p;
        }
    }
    
    public int q(int t) {
        int len = result.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (result[mid][0] <= t) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (result[end][0] <= t) {
            return result[end][1];
        }
        return result[start][1];
    }
}



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