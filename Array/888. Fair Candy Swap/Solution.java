class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int aSum = getSum(A);
        int bSum = getSum(B);
        
        int sum = aSum + bSum;
        int average = sum / 2;
        
        int[] result = new int[2];
        
        Set<Integer> set = new HashSet();
        for (int b : B) {
            set.add(b);
        }
        
        for (int a : A) {
            if (set.contains(average - (aSum - a))) {
                result[0] = a;
                result[1] = average - (aSum - a);
            }
        }
        
        return result;
    }
    
    private int getSum(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        return sum;
    }
}