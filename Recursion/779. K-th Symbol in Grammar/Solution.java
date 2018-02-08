class Solution {
    public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        int val = kthGrammar(N - 1, (K + 1) / 2);
        if (val == 0) {
            return 1 - K % 2;
        }
        else {
            return K % 2;
        }
    }
}

class Solution {
    public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        return (~K & 1) ^ kthGrammar(N - 1, (K + 1) / 2);
    }
}