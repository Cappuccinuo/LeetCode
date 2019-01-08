class Solution {
    public int[] numsSameConsecDiff(int N, int K) {
        Set<Integer> set = new HashSet();
        for (int i = 1; i <= 9; i++) {
            set.add(i);
        }
        
        for (int step = 1; step <= N - 1; step++) {
            Set<Integer> set2 = new HashSet();
            for (int x : set) {
                int lastDigit = x % 10;
                
                if (lastDigit + K <= 9) {
                    set2.add(x * 10 + lastDigit + K);
                }
                
                if (lastDigit - K >= 0) {
                    set2.add(x * 10 + lastDigit - K);
                }
            }
            set = set2;
        }
        
        if (N == 1) {
            set.add(0);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int x : set) {
            result[index++] = x;
        }
        return result;
    }
}