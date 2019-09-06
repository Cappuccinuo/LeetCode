class Solution {
    int mod = 1000000007;
    
    public int numPrimeArrangements(int n) {
        int primeCount = countPrimes(n);
        int notPrimeCount = n - primeCount;
        
        int i;
        long res = 1;
        for (i = 2; i <= primeCount; i++) {
            res = (res * i) % mod;
        }
        for (i = 2; i <= notPrimeCount; i++) {
            res = (res * i) % mod;
        }

        return (int)(res % mod);
    }
    
    private int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        int i, j;
        for (i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        
        for (i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}