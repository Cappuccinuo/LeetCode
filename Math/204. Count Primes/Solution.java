class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;
        Arrays.fill(isPrime, true);
        for (int factor = 2; factor * factor <= n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor * factor; j < n; j += factor) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == true) {
                count++;
            }
        }
        return count;
    }
}