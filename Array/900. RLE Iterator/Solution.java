class RLEIterator {
    int i;
    int q;
    int[] A;
    public RLEIterator(int[] A) {
        this.A = A;
        i = 0;
        q = 0;
    }
    
    public int next(int n) {
        while (i < A.length) {
            if (q + n > A[i]) {
                n -= A[i] - q;
                i += 2;
                q = 0;
            }
            else {
                q += n;
                return A[i + 1];
            }
        }
        return -1;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */