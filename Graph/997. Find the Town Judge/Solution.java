// Time Complexity: O(T + N)
// Space Complexity: O(N)

class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] degree = new int[N + 1];
        for (int[] relation : trust) {
            int in = relation[1];
            int out = relation[0];
            degree[in]++;
            degree[out]--;
        }
        
        for (int i = 1; i <= N; i++) {
            if (degree[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}

// Time Complexity: O(T + N)
// Space Complexity: O(N^2)
class Solution {
    public int findJudge(int N, int[][] trust) {
        boolean[][] knows = new boolean[N + 1][N + 1];
        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];
            knows[a][b] = true;
        }
        
        int candidate = 1;
        for (int person = 2; person <= N; person++) {
            if (knows[candidate][person]) {
                candidate = person;
            }
        }
        
        for (int person = 1; person <= N; person++) {
            if (person != candidate) {
                if (knows[candidate][person] || !knows[person][candidate]) {
                    return -1;
                }
            }
        }
        return candidate;
    }
}