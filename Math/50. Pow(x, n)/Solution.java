// 2018. 3. 19
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return recursiveHelper(x, N);
    }
    
    public double recursiveHelper(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return recursiveHelper(x * x, n / 2);
        }
        else {
            return x * recursiveHelper(x * x, n / 2);
        }
    }
}

class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        double current = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                result = result * current;
            }
            current = current * current;
        }
        return result;
    }
}







class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } 
        if (x == 0) {
            return 0;
        }
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                n++;
                if (x < 0) {
                    x = -x;
                }
            }
            n = -n;
            x = 1 / x;
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        else {
            return x * myPow(x * x, n / 2);
        }
    }
}